package com.Dao.entity;
// Generated May 7, 2017 2:26:51 AM by Hibernate Tools 3.6.0.Final

import java.util.Date;

/**
 * MaterialStockmanage generated by hbm2java
 */
public class MaterialStockmanage implements java.io.Serializable {

	private String materialsStockManageId;
	private Materials materials;
	private Staff staff;
	private Allocation allocation;
	private Repository repository;
	private Integer materialsAmount;
	private Integer materialsTakeMaterialPersonId;
	private Integer materialsBringMaterialPersonId;
	private Integer materialsStockManageType;
	private Date materialsStockManageDate;

	public MaterialStockmanage() {
	}

	public MaterialStockmanage(String materialsStockManageId, Materials materials, Allocation allocation) {
		this.materialsStockManageId = materialsStockManageId;
		this.materials = materials;
		this.allocation = allocation;
	}

	public MaterialStockmanage(String materialsStockManageId, Materials materials, Staff staff, Allocation allocation,
			Repository repository, Integer materialsAmount, Integer materialsTakeMaterialPersonId,
			Integer materialsBringMaterialPersonId, Integer materialsStockManageType, Date materialsStockManageDate) {
		this.materialsStockManageId = materialsStockManageId;
		this.materials = materials;
		this.staff = staff;
		this.allocation = allocation;
		this.repository = repository;
		this.materialsAmount = materialsAmount;
		this.materialsTakeMaterialPersonId = materialsTakeMaterialPersonId;
		this.materialsBringMaterialPersonId = materialsBringMaterialPersonId;
		this.materialsStockManageType = materialsStockManageType;
		this.materialsStockManageDate = materialsStockManageDate;
	}

	public String getMaterialsStockManageId() {
		return this.materialsStockManageId;
	}

	public void setMaterialsStockManageId(String materialsStockManageId) {
		this.materialsStockManageId = materialsStockManageId;
	}

	public Materials getMaterials() {
		return this.materials;
	}

	public void setMaterials(Materials materials) {
		this.materials = materials;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Allocation getAllocation() {
		return this.allocation;
	}

	public void setAllocation(Allocation allocation) {
		this.allocation = allocation;
	}

	public Repository getRepository() {
		return this.repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public Integer getMaterialsAmount() {
		return this.materialsAmount;
	}

	public void setMaterialsAmount(Integer materialsAmount) {
		this.materialsAmount = materialsAmount;
	}

	public Integer getMaterialsTakeMaterialPersonId() {
		return this.materialsTakeMaterialPersonId;
	}

	public void setMaterialsTakeMaterialPersonId(Integer materialsTakeMaterialPersonId) {
		this.materialsTakeMaterialPersonId = materialsTakeMaterialPersonId;
	}

	public Integer getMaterialsBringMaterialPersonId() {
		return this.materialsBringMaterialPersonId;
	}

	public void setMaterialsBringMaterialPersonId(Integer materialsBringMaterialPersonId) {
		this.materialsBringMaterialPersonId = materialsBringMaterialPersonId;
	}

	public Integer getMaterialsStockManageType() {
		return this.materialsStockManageType;
	}

	public void setMaterialsStockManageType(Integer materialsStockManageType) {
		this.materialsStockManageType = materialsStockManageType;
	}

	public Date getMaterialsStockManageDate() {
		return this.materialsStockManageDate;
	}

	public void setMaterialsStockManageDate(Date materialsStockManageDate) {
		this.materialsStockManageDate = materialsStockManageDate;
	}

}
