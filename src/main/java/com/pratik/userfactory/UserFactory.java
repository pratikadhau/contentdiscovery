package com.pratik.userfactory;

import com.pratik.user.User;
import com.pratik.user.User.Gender;

public class UserFactory {
	   
	public void insertUser(String name,Integer age,Gender gender){
	  UserRepo.save(name,age,gender);	
	}
	
	public User getUser(String name){
	  return UserRepo.retrive(name);	
    }
	
	public void removeUser(String name){
	   UserRepo.remove(name);	
	}
}
