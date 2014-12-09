package com.pratik;

import java.util.List;

import com.pratik.dicscovery.engine.DiscoveryEngine;
import com.pratik.discovery.content.Content;
import com.pratik.user.User.Gender;
import com.pratik.user.modifyinterests.ModifyIntersts;
import com.pratik.userfactory.UserFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        UserFactory factory =new UserFactory();
        //add remove users
        factory.insertUser("pratik", 26, Gender.MALE);
        DiscoveryEngine discoveryEngine = new DiscoveryEngine();
        
        //modify interests
        ModifyIntersts modifyIntersts =new ModifyIntersts();
        modifyIntersts.addInterstFor("pratik", "sports","entertainment");
        System.out.println("############################Before#######################################");
        List<Content> contents = discoveryEngine.getContentsFor("pratik");
        System.out.println(contents);
        System.out.println("############################After#######################################");
        modifyIntersts.removeInterestsFor("pratik", "entertainment"); 
		List<Content> contents2 = discoveryEngine.getContentsFor("pratik");
		System.out.println(contents2);
    }
}
