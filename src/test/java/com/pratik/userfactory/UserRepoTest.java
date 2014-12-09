package com.pratik.userfactory;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.pratik.exceptions.UserNotFounException;
import com.pratik.user.User;
import com.pratik.user.User.Gender;


public class UserRepoTest {
	@Before
	public void tearDown(){
		UserRepo.clear();
	}

	@Test
	public void shouldStoreUserInRepo() throws Exception {
		String name = "Pratik";
		Integer age = 25;
		Gender male = Gender.MALE;
		User actual = UserRepo.save(name, age, male);
		Assert.assertEquals(name, actual.getName());
		Assert.assertEquals(age, actual.getAge());
		Assert.assertEquals(male, actual.getGender());
	}  
	
	@Test
	public void shouldRemoveUser() throws Exception {
		String name = "Pratik";
		Integer age = 25;
		Gender male = Gender.MALE;
		User actual = UserRepo.save(name, age, male);
		UserRepo.remove(actual.getName());
		try{
		UserRepo.retrive(actual.getName());
		Assert.fail("user is not removed");
		}catch(UserNotFounException exception){

		}
	}
	
	@Test(expected=UserNotFounException.class)
	public void shouldThrowUserNotFounExceptionIfUserIsNotPresent(){
		UserRepo.remove("Pratik");
		
	}
}
