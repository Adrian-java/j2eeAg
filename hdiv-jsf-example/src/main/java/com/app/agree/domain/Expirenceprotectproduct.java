package com.app.agree.domain;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

/**
 * Expirenceprotectproduct generated by hbm2java
 */
public class Expirenceprotectproduct implements java.io.Serializable {

	private Integer id;
	private Plantprotectprroduct plantprotectprroduct;
	private Experience experience;

	public Expirenceprotectproduct() {
	}

	public Expirenceprotectproduct(Plantprotectprroduct plantprotectprroduct,
			Experience experience) {
		this.plantprotectprroduct = plantprotectprroduct;
		this.experience = experience;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Plantprotectprroduct getPlantprotectprroduct() {
		return this.plantprotectprroduct;
	}

	public void setPlantprotectprroduct(
			Plantprotectprroduct plantprotectprroduct) {
		this.plantprotectprroduct = plantprotectprroduct;
	}

	public Experience getExperience() {
		return this.experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

}