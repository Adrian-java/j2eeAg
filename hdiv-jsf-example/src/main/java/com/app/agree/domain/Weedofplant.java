package com.app.agree.domain;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

/**
 * Weedofplant generated by hbm2java
 */
public class Weedofplant implements java.io.Serializable {

	private Integer id;
	private Plant plant;
	private Weed weed;

	public Weedofplant() {
	}

	public Weedofplant(Plant plant, Weed weed) {
		this.plant = plant;
		this.weed = weed;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Plant getPlant() {
		return this.plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}

	public Weed getWeed() {
		return this.weed;
	}

	public void setWeed(Weed weed) {
		this.weed = weed;
	}

}
