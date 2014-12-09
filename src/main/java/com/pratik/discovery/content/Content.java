package com.pratik.discovery.content;

import java.util.HashSet;
import java.util.Set;

import com.pratik.exceptions.EmptyURLException;

public class Content {
	private String description;
	private Set<String> tags; 
	private String url;
	
	
	public Content(String description,String url) {
		if(url==null || url.isEmpty())
			throw new EmptyURLException("URL is not valid");
		this.description  = description;
		this.url =url;
		this.tags = new HashSet<String>();
	}
	
	public boolean isTaggedFor(Set<String> interests) {
		for (String interest : interests) {
			if(tags.contains(interest))
				return true;
		}
		return false;
	}
	
	public boolean isTaggedFor(String ...interests) {
		for (String interest : interests) {
			if(tags.contains(interest))
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Content [description=" + description + ", tags=" + tags
				+ ", url=" + url + "]\n";
	}
	
	public void addTags(String ...tags){
		for (String tag : tags) {
			this.tags.add(tag);
		}
	} 
	
	  
}
