package com.Dao.entity;
// Generated May 7, 2017 2:26:51 AM by Hibernate Tools 3.6.0.Final

/**
 * MaterialsWipId generated by hbm2java
 */
public class MaterialsWipId implements java.io.Serializable {

	private int materialsId;
	private int wipId;

	public MaterialsWipId() {
	}

	public MaterialsWipId(int materialsId, int wipId) {
		this.materialsId = materialsId;
		this.wipId = wipId;
	}

	public int getMaterialsId() {
		return this.materialsId;
	}

	public void setMaterialsId(int materialsId) {
		this.materialsId = materialsId;
	}

	public int getWipId() {
		return this.wipId;
	}

	public void setWipId(int wipId) {
		this.wipId = wipId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MaterialsWipId))
			return false;
		MaterialsWipId castOther = (MaterialsWipId) other;

		return (this.getMaterialsId() == castOther.getMaterialsId()) && (this.getWipId() == castOther.getWipId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMaterialsId();
		result = 37 * result + this.getWipId();
		return result;
	}

}
