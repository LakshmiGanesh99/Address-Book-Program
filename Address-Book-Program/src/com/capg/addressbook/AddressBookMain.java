package com.capg.addressbook;

import java.util.*;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);

	int numOfContact = 0;
	private ArrayList<Contact> contactArray;
	private Map<String, Contact> contactMap;

	public AddressBookMain() {
		contactArray = new ArrayList<>();
		contactMap = new HashMap<>();
	}

	public void addContact(String firstName, String lastName, String address, String city, String state,
			String pinCode, String phoneNumber, String emailId) {
		Contact obj = new Contact(firstName, lastName, address, city, state, pinCode, phoneNumber, emailId);
		contactArray.add(obj);
		contactMap.put(firstName, obj);
	}

	public void printContact() {
		System.out.println(contactArray);
	}

	public void editContact() {
		System.out.println("Enter The First Name to edit the contact details");
		String firstName = sc.next();
		Contact contact = contactMap.get(firstName);
		System.out.println("Enter the Address");
		String address = sc.next();
		contact.setAddress(address);
		System.out.println("Enter the City");
		String city = sc.next();
		contact.setCity(city);
		System.out.println("Enter the State");
		String state = sc.next();
		contact.setState(state);
		System.out.println("Enter the Pincode");
		String pin = sc.next();
		contact.setZip(pin);
		System.out.println("Enter the Number");
		String mobile = sc.next();
		contact.setMobile(mobile);
		System.out.println("Enter the Email");
		String email = sc.next();
		contact.setEmail(email);
	}

	public void deleteContact() {
		System.out.println("Enter The First Name to delete the contact details");
		String firstName = sc.next();
		Contact obj = contactMap.get(firstName);
		contactArray.remove(obj);
	}

	public static void main(String args[]) {

		System.out.print("Enter FirstName,Last Name,address,city,state,pincode,phonenumber,email");
		String fname = sc.next();
		String lname = sc.next();
		String addressNew = sc.next();
		String cityNew = sc.next();
		String stateNew = sc.next();
		String zip = sc.next();
		String mobiileNumber = sc.next();
		String email = sc.next();
		AddressBookMain contact = new AddressBookMain();
		contact.addContact(fname, lname, addressNew, cityNew, stateNew, zip, mobiileNumber, email);
		contact.printContact();
		contact.editContact();
		contact.deleteContact();
		contact.printContact();
	}
}