package com.pratik.user;

import java.util.HashSet;
import java.util.Set;

import com.pratik.exceptions.IncorrecrAgeEception;

public class User {

	private String name;
	private Integer age;
	private Gender gender;
	Set<String> interests;

	public User(String name, Integer age, Gender gender) {
		this.name = name;
		if (age < 1)
			throw new IncorrecrAgeEception(age + "age is not allowed");
		this.age = age;
		this.gender = gender;
		this.interests = new HashSet<String>();
	}

	public static enum Gender {
		MALE, FEMALE
	}

	public String getName() {
		return name;
	}


	public Integer getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public void addInterest(String... interests) {
		for (String interest : interests) {
			this.interests.add(interest);
		}
	}

	public void removeInterest(String... interests) {
		for (String interest : interests) {
			this.interests.remove(interest);
		}
	}

	public Set<String> getInterests() {
		return this.interests;
	}
}
