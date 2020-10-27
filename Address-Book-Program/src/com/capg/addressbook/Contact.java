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

    public Contact(String firstName,String lastName,String address,String city,String state,String pinCode,String mobileNumber,String emailId)
    {
     this.firstName=firstName;
     this.lastName=lastName;
     this.address=address;
     this.city=city;
     this.state=state;
     this.zip=pinCode;
     this.mobile=mobileNumber;
     this.email=emailId;
    }
@Override
public String toString()
    {
    return "First Name: "+firstName+" \nLast Name: "+lastName+"\nAddress :"+address+"\nCity: "+city+"\nPincode: "+zip+"\nState: "+state+"\nPhoneNumber: "+mobile+"\nEmail ID: "+email;
    }
}
