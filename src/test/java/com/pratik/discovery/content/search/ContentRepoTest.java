package com.pratik.discovery.content.search;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Test;

import com.pratik.discovery.content.Content;


public class ContentRepoTest {

	@Test
	public void shouldReturnInterests() throws Exception {
		Set<String> set = new HashSet<String>();
		set.add("cricket");		
		List<Content> list = ContentRepo.get(set);
		Assert.assertEquals(2, list.size());
		
	}
	
	@Test
	public void shouldReturnForMultipleIntersts() throws Exception {
		Set<String> set = new HashSet<String>();
		set.add("news");
		set.add("music");
		List<Content> list = ContentRepo.get(set);
		Assert.assertEquals(5, list.size());
		
	}
}
