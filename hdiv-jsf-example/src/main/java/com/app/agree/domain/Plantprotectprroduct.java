package com.app.agree.domain;

// Generated 2014-08-13 22:26:27 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;

/**
 * Plantprotectprroduct generated by hbm2java
 */
public class Plantprotectprroduct implements java.io.Serializable {

	private Integer id;
	private String name;
	private String type;
	private Set expirenceprotectproducts = new HashSet(0);
	private Set portionofprotectproducts = new HashSet(0);

	public Plantprotectprroduct() {
	}

	public Plantprotectprroduct(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Plantprotectprroduct(String name, String type,
			Set expirenceprotectproducts, Set portionofprotectproducts) {
		this.name = name;
		this.type = type;
		this.expirenceprotectproducts = expirenceprotectproducts;
		this.portionofprotectproducts = portionofprotectproducts;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getExpirenceprotectproducts() {
		return this.expirenceprotectproducts;
	}

	public void setExpirenceprotectproducts(Set expirenceprotectproducts) {
		this.expirenceprotectproducts = expirenceprotectproducts;
	}

	public Set getPortionofprotectproducts() {
		return this.portionofprotectproducts;
	}

	public void setPortionofprotectproducts(Set portionofprotectproducts) {
		this.portionofprotectproducts = portionofprotectproducts;
	}

}