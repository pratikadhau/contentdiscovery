package com.pratik.discovery.content.search;

import java.util.List;
import java.util.Set;

import com.pratik.discovery.content.Content;

public class ContentSearch {

	public List<Content> search(Set<String> interests) {
		return ContentRepo.get(interests);
	}

}
