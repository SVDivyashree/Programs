package com.bridgelabz.addressinterface;

public interface AddressInterface
{
	public void addPerson(String firstname,String lastname,String street,String city,String state,Long zipcode,Long phonenumber);
	public void deletePerson();
	public void sortByLastName();
	public void sortByZipCode();

}
