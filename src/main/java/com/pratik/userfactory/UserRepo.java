package com.pratik.userfactory;

import java.util.HashMap;
import java.util.Map;

import com.pratik.exceptions.UserNotFounException;
import com.pratik.user.User;
import com.pratik.user.User.Gender;

public class UserRepo {
	private static Map<String, User> userMap= new HashMap<String, User>();
	public static User save(String name, Integer age, Gender gender) {
		User user = new User(name,age,gender);
		userMap.put(name, user);
		return user;
	}
	
	public static User retrive(String name) throws UserNotFounException{
		if(!userMap.containsKey(name)) {
			throw new UserNotFounException(name+" is not an user.");
		}
		return userMap.get(name);
	}

	public static void remove(String name) throws UserNotFounException{
		if(!userMap.containsKey(name)) {
			throw new UserNotFounException(name +" is not an user. This user is already removed");
		}
		userMap.remove(name);
	}

    protected static void clear() {
	  userMap.clear();	
	}

}

