package com.capg.addressbook;

import java.util.*;

public class AddressBookManagement {
	static Scanner sc = new Scanner(System.in);
	private static Map<String, AddressBookMain> addressMap = new TreeMap<>();

	public static void addAddressBook() {
		AddressBookMain addressBook = new AddressBookMain();
		System.out.println("Enter the name of the address book");
		String name = sc.next();
		addressMap.put(name, addressBook);
		addressBook.maintainAddressBook();
	}

	public static void main(String args[]) {

		char addNew = 'Y';
		while (addNew == 'Y') {
			AddressBookManagement.addAddressBook();
			System.out.println("Do you want to add new address book? (Y/N)");
			addNew = sc.next().charAt(0);
		}
	}
}
