package com.app.agree.domain;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

/**
 * Fieldweed generated by hbm2java
 */
public class Fieldweed implements java.io.Serializable {

	private Integer id;
	private Weed weed;
	private Field field;

	public Fieldweed() {
	}

	public Fieldweed(Weed weed, Field field) {
		this.weed = weed;
		this.field = field;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Weed getWeed() {
		return this.weed;
	}

	public void setWeed(Weed weed) {
		this.weed = weed;
	}

	public Field getField() {
		return this.field;
	}

	public void setField(Field field) {
		this.field = field;
	}

}