package com.app.agree.domain;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

import java.util.Date;

/**
 * Task generated by hbm2java
 */
public class Task implements java.io.Serializable {

	private Integer id;
	private Field field;
	private Date dateOfExecution;
	private Date datePlanned;
	private String comments;

	public Task() {
	}

	public Task(Field field, Date datePlanned, String comments) {
		this.field = field;
		this.datePlanned = datePlanned;
		this.comments = comments;
	}

	public Task(Field field, Date dateOfExecution, Date datePlanned,
			String comments) {
		this.field = field;
		this.dateOfExecution = dateOfExecution;
		this.datePlanned = datePlanned;
		this.comments = comments;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Field getField() {
		return this.field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public Date getDateOfExecution() {
		return this.dateOfExecution;
	}

	public void setDateOfExecution(Date dateOfExecution) {
		this.dateOfExecution = dateOfExecution;
	}

	public Date getDatePlanned() {
		return this.datePlanned;
	}

	public void setDatePlanned(Date datePlanned) {
		this.datePlanned = datePlanned;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}