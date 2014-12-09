package com.pratik.discovery.content;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.pratik.exceptions.EmptyURLException;


public class ContentTest {

	@Test(expected=EmptyURLException.class)
	public void shouldNotAllowContenWithNullURL() throws Exception {
		@SuppressWarnings("unused")
		Content content = new Content(null, null );
	}
	
	@Test(expected=EmptyURLException.class)
	public void shouldNotAllowContenWithEmptyURL() throws Exception {
		@SuppressWarnings("unused")
		Content content = new Content(null,"" );
	}
	
	@Test
	public void shouldAddTag() throws Exception {
		Content content = new Content(null, "pratik.adhau");
		String tag = "entertainment";
		content.addTags(tag);
		Set<String>  interests = new HashSet<String>();
		interests.add(tag);
		assertTrue(content.isTaggedFor(interests));
	}

	@Test
	public void shouldReturnTrueIfContentContainsTag() throws Exception {
		Content content = new Content(null, "pratik.adhau");
		content.addTags("entertainment","politics","sports");
		Set<String>  interests = new HashSet<String>();
		interests.add("entertainment");
		interests.add("politics");
		assertTrue(content.isTaggedFor(interests));
	}
	
	@Test
	public void shouldReturnFalseIfContentDoesnotContainTag() throws Exception {
		Content content = new Content(null, "pratik.adhau");
		content.addTags("entertainment","politics","sports");
		Set<String>  interests = new HashSet<String>();
		interests.add("movie");
		assertFalse(content.isTaggedFor(interests));
	}
}
