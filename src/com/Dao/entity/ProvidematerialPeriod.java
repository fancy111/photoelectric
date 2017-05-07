package com.Dao.entity;
// Generated May 7, 2017 2:26:51 AM by Hibernate Tools 3.6.0.Final

/**
 * ProvidematerialPeriod generated by hbm2java
 */
public class ProvidematerialPeriod implements java.io.Serializable {

	private ProvidematerialPeriodId id;
	private Provider provider;
	private Materials materials;
	private Integer provideMaterialPeriod;
	private Long provideMaterialCost;

	public ProvidematerialPeriod() {
	}

	public ProvidematerialPeriod(ProvidematerialPeriodId id, Provider provider, Materials materials) {
		this.id = id;
		this.provider = provider;
		this.materials = materials;
	}

	public ProvidematerialPeriod(ProvidematerialPeriodId id, Provider provider, Materials materials,
			Integer provideMaterialPeriod, Long provideMaterialCost) {
		this.id = id;
		this.provider = provider;
		this.materials = materials;
		this.provideMaterialPeriod = provideMaterialPeriod;
		this.provideMaterialCost = provideMaterialCost;
	}

	public ProvidematerialPeriodId getId() {
		return this.id;
	}

	public void setId(ProvidematerialPeriodId id) {
		this.id = id;
	}

	public Provider getProvider() {
		return this.provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Materials getMaterials() {
		return this.materials;
	}

	public void setMaterials(Materials materials) {
		this.materials = materials;
	}

	public Integer getProvideMaterialPeriod() {
		return this.provideMaterialPeriod;
	}

	public void setProvideMaterialPeriod(Integer provideMaterialPeriod) {
		this.provideMaterialPeriod = provideMaterialPeriod;
	}

	public Long getProvideMaterialCost() {
		return this.provideMaterialCost;
	}

	public void setProvideMaterialCost(Long provideMaterialCost) {
		this.provideMaterialCost = provideMaterialCost;
	}

}