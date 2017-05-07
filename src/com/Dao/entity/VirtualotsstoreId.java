package com.Dao.entity;
// Generated May 7, 2017 2:26:51 AM by Hibernate Tools 3.6.0.Final

/**
 * VirtualotsstoreId generated by hbm2java
 */
public class VirtualotsstoreId implements java.io.Serializable {

	private int virtualOtsStoreRepositoryId;
	private int virtualOtsStoreOtsId;
	private int virtualOtsStoreOrderId;

	public VirtualotsstoreId() {
	}

	public VirtualotsstoreId(int virtualOtsStoreRepositoryId, int virtualOtsStoreOtsId, int virtualOtsStoreOrderId) {
		this.virtualOtsStoreRepositoryId = virtualOtsStoreRepositoryId;
		this.virtualOtsStoreOtsId = virtualOtsStoreOtsId;
		this.virtualOtsStoreOrderId = virtualOtsStoreOrderId;
	}

	public int getVirtualOtsStoreRepositoryId() {
		return this.virtualOtsStoreRepositoryId;
	}

	public void setVirtualOtsStoreRepositoryId(int virtualOtsStoreRepositoryId) {
		this.virtualOtsStoreRepositoryId = virtualOtsStoreRepositoryId;
	}

	public int getVirtualOtsStoreOtsId() {
		return this.virtualOtsStoreOtsId;
	}

	public void setVirtualOtsStoreOtsId(int virtualOtsStoreOtsId) {
		this.virtualOtsStoreOtsId = virtualOtsStoreOtsId;
	}

	public int getVirtualOtsStoreOrderId() {
		return this.virtualOtsStoreOrderId;
	}

	public void setVirtualOtsStoreOrderId(int virtualOtsStoreOrderId) {
		this.virtualOtsStoreOrderId = virtualOtsStoreOrderId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VirtualotsstoreId))
			return false;
		VirtualotsstoreId castOther = (VirtualotsstoreId) other;

		return (this.getVirtualOtsStoreRepositoryId() == castOther.getVirtualOtsStoreRepositoryId())
				&& (this.getVirtualOtsStoreOtsId() == castOther.getVirtualOtsStoreOtsId())
				&& (this.getVirtualOtsStoreOrderId() == castOther.getVirtualOtsStoreOrderId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getVirtualOtsStoreRepositoryId();
		result = 37 * result + this.getVirtualOtsStoreOtsId();
		result = 37 * result + this.getVirtualOtsStoreOrderId();
		return result;
	}

}
