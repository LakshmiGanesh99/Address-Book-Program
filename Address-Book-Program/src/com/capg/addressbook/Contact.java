package com.capg.addressbook;

public class Contact {
	public String firstName;
	public String lastName;
	public String address;
	public String state;
	public String city;
	public String zip;
	public String mobile;
	public String email;

	public Contact(String firstName, String lastName, String address, String city, String state, String pinCode,
			String mobileNumber, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = pinCode;
		this.mobile = mobileNumber;
		this.email = emailId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String pinCode) {
		this.zip = pinCode;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String phoneNumber) {
		this.mobile = phoneNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String emailId) {
		this.email = emailId;
	}

	@Override
	public String toString() {
		return "First Name:  " + firstName + " \nLast Name: " + lastName + "\nAddress :" + address + "\nCity: " + city
				+ "\nPincode: " + zip + "\nState: " + state + "\nPhoneNumber: " + mobile + "\nEmail ID: " + email;
	}
}