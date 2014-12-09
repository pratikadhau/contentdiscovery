package com.pratik.user.modifyinterests;

import com.pratik.user.User;
import com.pratik.userfactory.UserRepo;

public class ModifyIntersts {

	public void addInterstFor(String name, String ...interest) {
		User user = UserRepo.retrive(name);
		user.addInterest(interest);
	}

	public void removeInterestsFor(String name, String ...interests) {
		User user = UserRepo.retrive(name);
		user.removeInterest(interests);		
	}
  
}
