package com.Dao.entity;
// Generated May 7, 2017 2:26:51 AM by Hibernate Tools 3.6.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category implements java.io.Serializable {

	private CategoryId id;
	private Set<Ots> otses = new HashSet<Ots>(0);
	private Set<Ots> otses_1 = new HashSet<Ots>(0);

	public Category() {
	}

	public Category(CategoryId id) {
		this.id = id;
	}

	public Category(CategoryId id, Set<Ots> otses, Set<Ots> otses_1) {
		this.id = id;
		this.otses = otses;
		this.otses_1 = otses_1;
	}

	public CategoryId getId() {
		return this.id;
	}

	public void setId(CategoryId id) {
		this.id = id;
	}

	public Set<Ots> getOtses() {
		return this.otses;
	}

	public void setOtses(Set<Ots> otses) {
		this.otses = otses;
	}

	public Set<Ots> getOtses_1() {
		return this.otses_1;
	}

	public void setOtses_1(Set<Ots> otses_1) {
		this.otses_1 = otses_1;
	}

}