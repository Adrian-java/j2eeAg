package com.app.agree.domain;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;

/**
 * Typeofexpirence generated by hbm2java
 */
public class Typeofexpirence implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set experiences = new HashSet(0);

	public Typeofexpirence() {
	}

	public Typeofexpirence(String name) {
		this.name = name;
	}

	public Typeofexpirence(String name, Set experiences) {
		this.name = name;
		this.experiences = experiences;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getExperiences() {
		return this.experiences;
	}

	public void setExperiences(Set experiences) {
		this.experiences = experiences;
	}

}
