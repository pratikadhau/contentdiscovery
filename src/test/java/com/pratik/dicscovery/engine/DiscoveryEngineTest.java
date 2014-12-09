package com.pratik.dicscovery.engine;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.pratik.discovery.content.Content;
import com.pratik.user.User;
import com.pratik.user.User.Gender;
import com.pratik.user.modifyinterests.ModifyIntersts;
import com.pratik.userfactory.UserFactory;


public class DiscoveryEngineTest {

	@Test
	public void shouldReturnContentsForUserId() {
		DiscoveryEngine classUndeTest=new DiscoveryEngine();
		UserFactory factory =new UserFactory();
		factory.insertUser("pratik", 26, Gender.MALE);
		User user = factory.getUser("pratik");
		ModifyIntersts modifyIntersts =new ModifyIntersts();
		modifyIntersts.addInterstFor("pratik", "sports");
		List<Content> contents= classUndeTest.getContentsFor(user.getName());
		for (Content content : contents) {
			Assert.assertTrue(content.isTaggedFor("sports"));
		}
	}
}
