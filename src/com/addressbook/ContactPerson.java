package com.addressbook;

public class ContactPerson {
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phone_number;
    private String email;

   public ContactPerson(String first_name, String last_name, String address, String city, String state, int zip, long phone_number, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String toString() {
        return "ContactPerson{"+"first_name='" + first_name + '\'' + ", last_name='" + last_name + '\'' + ", address='" + address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zip=" + zip + ", phone_number=" + phone_number + ", email='" + email + '\'' + '}';
    }
}


