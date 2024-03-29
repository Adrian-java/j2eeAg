package com.app.agree.domain;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Field generated by hbm2java
 */
public class Field implements java.io.Serializable {

	private Integer id;
	private Customer customer;
	private Cultivation cultivation;
	private Experience experience;
	private String coordinates;
	private Date startDate;
	private Date endDate;
	private int numberOfPlots;
	private String city;
	private Set plots = new HashSet(0);
	private Set tasks = new HashSet(0);
	private Set fieldweeds = new HashSet(0);

	public Field() {
	}

	public Field(Customer customer, Cultivation cultivation,
			Experience experience, Date startDate, int numberOfPlots,
			String city) {
		this.customer = customer;
		this.cultivation = cultivation;
		this.experience = experience;
		this.startDate = startDate;
		this.numberOfPlots = numberOfPlots;
		this.city = city;
	}

	public Field(Customer customer, Cultivation cultivation,
			Experience experience, String coordinates, Date startDate,
			Date endDate, int numberOfPlots, String city, Set plots, Set tasks,
			Set fieldweeds) {
		this.customer = customer;
		this.cultivation = cultivation;
		this.experience = experience;
		this.coordinates = coordinates;
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberOfPlots = numberOfPlots;
		this.city = city;
		this.plots = plots;
		this.tasks = tasks;
		this.fieldweeds = fieldweeds;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cultivation getCultivation() {
		return this.cultivation;
	}

	public void setCultivation(Cultivation cultivation) {
		this.cultivation = cultivation;
	}

	public Experience getExperience() {
		return this.experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public String getCoordinates() {
		return this.coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getNumberOfPlots() {
		return this.numberOfPlots;
	}

	public void setNumberOfPlots(int numberOfPlots) {
		this.numberOfPlots = numberOfPlots;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set getPlots() {
		return this.plots;
	}

	public void setPlots(Set plots) {
		this.plots = plots;
	}

	public Set getTasks() {
		return this.tasks;
	}

	public void setTasks(Set tasks) {
		this.tasks = tasks;
	}

	public Set getFieldweeds() {
		return this.fieldweeds;
	}

	public void setFieldweeds(Set fieldweeds) {
		this.fieldweeds = fieldweeds;
	}

}
