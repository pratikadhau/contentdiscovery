package com.pratik.discovery.content.search;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Test;

import com.pratik.discovery.content.Content;


public class ContentSearchTest {

	@Test
	public void shouldReturnContentForGivenInterests() throws Exception {
		ContentSearch contentSearch = new ContentSearch();
		Set<String> set = new HashSet<String>();
		set.add("sports");		
		List<Content> contents = contentSearch.search(set);
		Assert.assertEquals(2, contents.size());
	}
	
	@Test
	public void shouldReturnEmptyContentForUnkownTag() throws Exception {
		ContentSearch contentSearch = new ContentSearch();
		Set<String> set = new HashSet<String>();
		set.add("politics");		
		List<Content> contents = contentSearch.search(set);
		Assert.assertEquals(0, contents.size());
	}
}
