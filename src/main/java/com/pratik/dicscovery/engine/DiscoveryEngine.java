package com.pratik.dicscovery.engine;

import java.util.List;

import com.pratik.discovery.content.Content;
import com.pratik.discovery.content.search.ContentSearch;
import com.pratik.user.User;
import com.pratik.userfactory.UserFactory;

public class DiscoveryEngine {
	UserFactory userFactory = new UserFactory();
	ContentSearch contentSearch = new ContentSearch();

	public List<Content> getContentsFor(String name) {
		User user = userFactory.getUser(name);
		return contentSearch.search(user.getInterests());
	}

}
