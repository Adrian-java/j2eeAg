package com.app.agree.domain;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;

/**
 * Plant generated by hbm2java
 */
public class Plant implements java.io.Serializable {

	private Integer id;
	private Weed weed;
	private Stage stage;
	private Plot plot;
	private String growth;
	private Set weedofplants = new HashSet(0);

	public Plant() {
	}

	public Plant(Weed weed, Stage stage, Plot plot, String growth) {
		this.weed = weed;
		this.stage = stage;
		this.plot = plot;
		this.growth = growth;
	}

	public Plant(Weed weed, Stage stage, Plot plot, String growth,
			Set weedofplants) {
		this.weed = weed;
		this.stage = stage;
		this.plot = plot;
		this.growth = growth;
		this.weedofplants = weedofplants;
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

	public Stage getStage() {
		return this.stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Plot getPlot() {
		return this.plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	public String getGrowth() {
		return this.growth;
	}

	public void setGrowth(String growth) {
		this.growth = growth;
	}

	public Set getWeedofplants() {
		return this.weedofplants;
	}

	public void setWeedofplants(Set weedofplants) {
		this.weedofplants = weedofplants;
	}

}
