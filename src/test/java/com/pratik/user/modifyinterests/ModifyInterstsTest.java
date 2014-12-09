package com.pratik.user.modifyinterests;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.pratik.user.User;
import com.pratik.user.User.Gender;
import com.pratik.userfactory.UserRepo;


public class ModifyInterstsTest {

	@Test
	public void shouldAddInterstForUser() throws Exception {
		ModifyIntersts modifyIntersts =new ModifyIntersts();
		User user1 = UserRepo.save("pratik", 26, Gender.MALE);
		User user2 = UserRepo.save("sam", 21, Gender.FEMALE);
		modifyIntersts.addInterstFor(user1.getName(),"sports");
		modifyIntersts.addInterstFor(user2.getName(),"music");
		assertTrue(user1.getInterests().contains("sports"));
		assertFalse(user1.getInterests().contains("music"));
		assertFalse(user2.getInterests().contains("sports"));
		assertTrue(user2.getInterests().contains("music"));
	}
	
	@Test
	public void shouldRemoveInterstForUser() throws Exception {
		ModifyIntersts modifyIntersts =new ModifyIntersts();
		User user1 = UserRepo.save("pratik", 26, Gender.MALE);
		modifyIntersts.addInterstFor(user1.getName(),"sports","music");
		modifyIntersts.removeInterestsFor(user1.getName(), "music");
		assertTrue(user1.getInterests().contains("sports"));
		assertFalse(user1.getInterests().contains("music"));
		
	}
}
