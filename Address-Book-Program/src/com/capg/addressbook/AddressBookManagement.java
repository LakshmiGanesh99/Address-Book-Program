package com.capg.addressbook;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AddressBookManagement {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {

		while (true) {
			System.out.println("Please Enter your choice \n1. Add a new Address Book \n2. Search person across all address books\n3. Show contact  by city\n4. Show contacts by state\n5. count contacts  by city\n6. count contacts by state\n7. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				while (true) {
					AddressBookMain m = new AddressBookMain();
					System.out.println("Enter A name for address Book");
					String name = sc.next();
					if (AddressBookManagement.addressMap.containsKey(name)) {
						System.out.println("Address Book already exists");
						continue;
					} else {
						AddressBookManagement.addressMap.put(name, m);
						System.out.println("In Address Book : " + name);
						m.maintainAddressBook();
						break;
					}
				}
				break;

			case 2:
				System.out.println("Enter city or state to search a person");
				String searchIn = sc.next();
				AddressBookManagement.searchPersonInBook(searchIn);
				break;

			case 3:
				showContactGroupedByCity();
				break;
			case 4:
				showContactGroupedByState();
				break;
			case 5:
				countByCity();
				break;
			case 6:
				countByState();
				break;
			case 7:
				System.exit(0);
				break;
			}
		}
	}

	private static Map<String, AddressBookMain> addressMap = new TreeMap<>();
	public static Map<String, Contact> cityToContactEntryMap = new TreeMap<>();
	public static Map<String, Contact> stateToContactEntryMap = new TreeMap<>();

	public static void addAddressBook() {
		AddressBookMain addressBook = new AddressBookMain();
		System.out.println("Enter the name of the address book");
		String name = sc.next();
		addressMap.put(name, addressBook);
		addressBook.maintainAddressBook();
	}

	private static void showContactGroupedByCity() {
		Set<String> listOfCity = cityToContactEntryMap.keySet();
		for (String cityName : listOfCity) {
			System.out.println("Contact Entries for CITY: " + cityName);
			searchPersonInBook(cityName);
		}
	}

	private static void showContactGroupedByState() {
		Set<String> listOfState = stateToContactEntryMap.keySet();
		for (String stateName : listOfState) {
			System.out.println("Contact Entries for STATE: " + stateName);
			searchPersonInBook(stateName);
		}
	}

	public static void countByCity() {
		Set<String> listOfCity = cityToContactEntryMap.keySet();
		for (String cityName : listOfCity) {
			Contact contactNumber = cityToContactEntryMap.get(cityName);
			System.out.println("No of contact entries for CITY " + cityName + " "
					+ ((Map<String, AddressBookMain>) contactNumber).size());
		}
	}

	public static void countByState() {
		Set<String> listOfState = stateToContactEntryMap.keySet();
		for (String stateName : listOfState) {
			Contact contactNumber = stateToContactEntryMap.get(stateName);
			System.out.println("No of contact entries for STATE " + stateName + " "
					+ ((Map<String, AddressBookMain>) contactNumber).size());
		}
	}

	public void showAddressBooks() {

		System.out.println("List of Address Books Added: ");
		addressMap.forEach((k, v) -> System.out.println(k + "\n"));
	}

	public static void searchPersonInBook(String search) {
		int numberOfPerson = 0;
		Iterator contactArray = addressMap.entrySet().iterator();
		while (contactArray.hasNext()) {
			Map.Entry entry = (Map.Entry) contactArray.next();
			AddressBookMain a = (AddressBookMain) entry.getValue();
			List<Contact> list = a.getcontactArray();
			for (Contact con : list) {
				if (con.getCity().equals(search) || con.getState().equals(search)) {
					System.out.println(con);
					numberOfPerson++;
				}
			}
			if (numberOfPerson == 0)
				System.out.println("No person was found");
		}
	}
}