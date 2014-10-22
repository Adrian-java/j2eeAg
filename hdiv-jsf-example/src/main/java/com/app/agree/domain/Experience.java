package com.app.agree.domain;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;

/**
 * Experience generated by hbm2java
 */
public class Experience implements java.io.Serializable {

	private Integer id;
	private Typeofexpirence typeofexpirence;
	private Employer employer;
	private String name;
	private String code;
	private String type;
	private Set customerexpirences = new HashSet(0);
	private Set verifications = new HashSet(0);
	private Set fields = new HashSet(0);
	private Set expirenceprotectproducts = new HashSet(0);

	public Experience() {
	}

	public Experience(Typeofexpirence typeofexpirence, Employer employer,
			String name, String code, String type) {
		this.typeofexpirence = typeofexpirence;
		this.employer = employer;
		this.name = name;
		this.code = code;
		this.type = type;
	}

	public Experience(Typeofexpirence typeofexpirence, Employer employer,
			String name, String code, String type, Set customerexpirences,
			Set verifications, Set fields, Set expirenceprotectproducts) {
		this.typeofexpirence = typeofexpirence;
		this.employer = employer;
		this.name = name;
		this.code = code;
		this.type = type;
		this.customerexpirences = customerexpirences;
		this.verifications = verifications;
		this.fields = fields;
		this.expirenceprotectproducts = expirenceprotectproducts;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Typeofexpirence getTypeofexpirence() {
		return this.typeofexpirence;
	}

	public void setTypeofexpirence(Typeofexpirence typeofexpirence) {
		this.typeofexpirence = typeofexpirence;
	}

	public Employer getEmployer() {
		return this.employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getCustomerexpirences() {
		return this.customerexpirences;
	}

	public void setCustomerexpirences(Set customerexpirences) {
		this.customerexpirences = customerexpirences;
	}

	public Set getVerifications() {
		return this.verifications;
	}

	public void setVerifications(Set verifications) {
		this.verifications = verifications;
	}

	public Set getFields() {
		return this.fields;
	}

	public void setFields(Set fields) {
		this.fields = fields;
	}

	public Set getExpirenceprotectproducts() {
		return this.expirenceprotectproducts;
	}

	public void setExpirenceprotectproducts(Set expirenceprotectproducts) {
		this.expirenceprotectproducts = expirenceprotectproducts;
	}

}