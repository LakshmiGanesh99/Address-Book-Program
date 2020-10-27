package com.capg.addressbook;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
	
	public static void searchPersonInBook(String search)
	{
		int numberOfPerson=0;
		Iterator contactArray=addressMap.entrySet().iterator();
		while(contactArray.hasNext())
		{
			Map.Entry entry=(Map.Entry) contactArray.next();
			AddressBookMain a=(AddressBookMain)entry.getValue();
			List<Contact> list=a.getcontactArray();
			for(Contact con:list)
			{
				if(con.getCity().equals(search)||con.getState().equals(search))
				{
					System.out.println(con);
					numberOfPerson++;
				}
			}
			if(numberOfPerson==0)
				System.out.println("No person was found");
		}
	}

	public static void main(String args[]) {

		while(true)
		{
			System.out.println("Please Enter your choice");
			System.out.println("1. Add a new Address Book");
			System.out.println("2. Search person across all address books");
			System.out.println("3. Exit");
			
			int choice=sc.nextInt();
			switch(choice)
			{
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
					System.out.println("\n In Address Book : " + name);
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
			break;
			}
		}
	}
}