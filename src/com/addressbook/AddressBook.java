package com.addressbook;

import java.util.Scanner;

public class AddressBook {

    private final String name;
    private final String address;
    private final String city;
    private final String state;
    private final String zip;
    private final String phone;
    private final String email;

    public AddressBook(String name, String address, String city, String state, String zip, String phone, String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return "AddressBook{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static void main(String args[]) {
        System.out.println("!!!Welcome to Address Book Program!!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = input.nextLine();
        System.out.print("Enter Your Address:");
        String address = input.nextLine();
        System.out.print("Enter Your city:");
        String city = input.nextLine();
        System.out.print("Enter Your State:");
        String state = input.nextLine();
        System.out.print("Enter Your Zip:");
        String zip = input.nextLine();
        System.out.print("Enter Your phone Number:");
        String phone = input.nextLine();
        System.out.print("Enter Your Email:");
        String email = input.nextLine();
        AddressBook book = new AddressBook(name, address, city, state, zip, phone, email);
        System.out.println(book.toString());
    }
}