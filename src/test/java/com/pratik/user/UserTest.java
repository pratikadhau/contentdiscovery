package com.pratik.user;

import junit.framework.Assert;

import org.junit.Test;

import com.pratik.exceptions.IncorrecrAgeEception;
import com.pratik.user.User.Gender;

public class UserTest {

	@Test(expected = IncorrecrAgeEception.class)
	public void shouldNotAllowAgeLessThanOne() throws Exception {
		@SuppressWarnings("unused")
		User user = new User("pratik", -1, Gender.MALE);
	}

	@Test
	public void shouldAddInterest() throws Exception {
		User classUnderTest = new User("pratik", 25, Gender.MALE);
		String interest = "Sports";
		classUnderTest.addInterest(interest);
		Assert.assertTrue(classUnderTest.getInterests().contains(interest)); 
	}
	
	@Test
	public void shouldRemoveInterest() throws Exception {
		User classUnderTest = new User("pratik", 25, Gender.MALE);
		String interest = "Sports";
		classUnderTest.removeInterest(interest);
		Assert.assertFalse(classUnderTest.getInterests().contains(interest)); 
	}
}
