package com.capgemini.phone_simulator.bean;

import java.io.Serializable;

public class ContactBean implements Serializable {

	private String contactName;
	private int contactNumber;
	private String groupName;
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	@Override
	public String toString() {
		return "ContactNameBean [contactName=" + contactName + ", contactNumber=" + contactNumber + ", groupName="
				+ groupName + "]";
	}
}




