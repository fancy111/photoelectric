package com.Dao.entity;
// Generated May 7, 2017 2:26:51 AM by Hibernate Tools 3.6.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private Integer departmentId;
	private String departmentName;
	private Set<Staff> staffs = new HashSet<Staff>(0);

	public Department() {
	}

	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department(String departmentName, Set<Staff> staffs) {
		this.departmentName = departmentName;
		this.staffs = staffs;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Staff> getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}

}
