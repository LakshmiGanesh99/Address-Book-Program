package com.capg.addressbook;

import java.util.*;

public class AddressBookMain {
	
	static Scanner sc=new Scanner(System.in);	

	int numOfContact=0;
	private Contact[] contactArray;
	
	public AddressBookMain()
	{
		contactArray=new Contact[5];
	}
	private void addNewContact(String firstName,String lastName,String address,String city,String state,String pinCode,String mobiileNumber,String emailId)
	{
		contactArray[numOfContact]= new Contact(firstName,lastName,address,city,state,pinCode,mobiileNumber,emailId);
		System.out.println(contactArray[numOfContact]);
		numOfContact++;
	}
	public static void main(String args[])
	{
	
	System.out.print("Enter FirstName,Last Name,address,city,state,pincode,phonenumber,email");
	String fname=sc.next();
	String lname=sc.next();
	String addressNew=sc.next();
	String cityNew=sc.next();
	String stateNew=sc.next();
	String zip=sc.next();
	String mobiileNumber=sc.next();
	String email=sc.next();
	AddressBookMain Contact1=new AddressBookMain();
	Contact1.addNewContact(fname,lname,addressNew,cityNew,stateNew,zip,mobiileNumber,email);
	}

}
