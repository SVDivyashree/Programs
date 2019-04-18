package com.bridgelabz.addressmodel;

public class AddressBook
{
	String firstname;
    String lastname;
    String street;
	String city;
	String state;
	Long zipcode;
	Long phonenumber;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getZipcode() {
		return zipcode;
	}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	 public String toString() {
	        return "firstname: " + firstname + "\n "
	                + "lastname: " + lastname + "\n "
	                        + "street: " + street +"\n " + "city: " + city + "\n "+"state: " + state+"\n "+
	                "zipcode: "+ zipcode+"\n " + "phonenumber: " + phonenumber ;
	    }


}


