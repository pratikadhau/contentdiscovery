package com.pratik.discovery.content.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.pratik.discovery.content.Content;

public class ContentRepo {
	private static List<Content> list ;
	
	static{
		Content content1 = new Content("cricinfo", "http://www.espncricinfo.com/");
		content1.addTags("sports","news","cricket");
		Content content2 = new Content("firstpost tech", "http://tech.firstpost.com/");
		content2.addTags("technology","news");
		Content content3 = new Content("etc bollywood", "http://www.etc.in/bollywood-business/");
		content3.addTags("entertainment","news","bollywood");
		Content content4 = new Content("Icc World Cup", "http://www.icc-cricket.com/cricket-world-cup");
		content4.addTags("cricket","news","worldcup","sports");
		Content content5 = new Content("Icc World Cup", "http://www.icc-cricket.com/cricket-world-cup");
		content5.addTags("music","entertainment","bollywood");
		list = Arrays.asList(content1,content2,content3,content4,content5);
	}
	
	public static List<Content> get(Set<String> interests) {
		List<Content> contents = new ArrayList<Content>();
		for (Content content : list) {
			if(content.isTaggedFor(interests))
				contents.add(content);
		}
		return contents;
	}

}
