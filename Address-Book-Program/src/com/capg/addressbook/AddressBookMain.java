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

	public void addContact() {
		System.out.println("Enter First Name");
		String firstName = sc.next();
		System.out.println("Enter last Name");
		String lastName = sc.next();
		System.out.println("Enter the Address");
		String address = sc.next();
		System.out.println("Enter the City");
		String city = sc.next();
		System.out.println("Enter the State");
		String state = sc.next();
		System.out.println("Enter the Pincode");
		String zip = sc.next();
		System.out.println("Enter the Number");
		String mobile = sc.next();
		System.out.println("Enter the Email");
		String email = sc.next();
		Contact obj = new Contact(firstName, lastName, address, city, state, zip, mobile, email);
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

	public void maintainAddressBook() {
		boolean exitFlag = true;
		while (exitFlag) {
			System.out.println("Enter your choice:");
			System.out.println("1. Add Contact Details");
			System.out.println("2. Edit Contact Details");
			System.out.println("3. Delete Contact Details");
			System.out.println("4. Exit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addContact();
				break;
			case 2:
				if (contactArray.size() == 0)
					System.out.println("Plese Enter contacts");
				else
					editContact();
				break;
			case 3:
				if (contactArray.size() == 0)
					System.out.println("Plese Enter contacts");
				else
					deleteContact();
				break;
			case 4:
				System.out.println("Exit");
				exitFlag = false;
				break;
			default :
				System.out.println("Choose correct option");
			}
		}
	}
}