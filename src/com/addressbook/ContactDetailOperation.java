package com.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactDetailOperation {

    ArrayList<ContactPerson> contact = new ArrayList<ContactPerson>();
    static Scanner scan = new Scanner(System.in);
    //add contact in arraylist
    public void addContact() {
        //taking Contact details from user
        System.out.println("First name");
        String First_name = scan.next();
        System.out.println("Last Name");
        String last_name = scan.next();
        System.out.println("Address");
        String address = scan.next();
        System.out.println("State");
        String state = scan.next();
        System.out.println("city");
        String city = scan.next();
        System.out.println("Zip");
        int zip = scan.nextInt();
        System.out.println("PhoneNo");
        long phone_number = scan.nextLong();
        System.out.println("Email");
        String email = scan.next();

        //parameterized constructor calling of Contact person class
        ContactPerson person = new ContactPerson(First_name, last_name, address, city, state, zip, phone_number, email);
        //Adding object element in arrayList
        contact.add(person);
    }
    //show contact details
    public void showDetails(){
        for (int i = 0; i < contact.size(); i++) {
            System.out.println(contact.get(i));
        }
    }
    //edit contact method called from main method
    public void editContact() {
        System.out.println("Enter the name you want to edit:");
        String enteredName = scan.next();
        boolean flag = false;
        for (ContactPerson person : contact) {
            if (person.first_name.equals(enteredName)) {
                flag = true;
                System.out.println("1. First Name\n" + "2.Last Name\n" + "3.Address\n" + "4.city\n" + "5.State\n" + "6.zip\n" + "7.phoneNumber\n" + "8.email");
                int choice = scan.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Enter First Name : ");
                        String firstName = scan.next();
                        person.first_name = firstName;
                        break;
                    case 2:
                        System.out.println("Enter First Name : ");
                        String lastName = scan.next();
                        person.last_name = lastName;
                        break;
                    case 3:
                        System.out.println("Enter Address : ");
                        String newAddress = scan.next();
                        person.address = newAddress;
                        break;
                    case 4:
                        System.out.println("Enter city : ");
                        String newCity = scan.next();
                        person.city = newCity;
                        break;
                    case 5:
                        System.out.println("Enter city : ");
                        String newState = scan.next();
                        person.state = newState;
                        break;
                    case 6:
                        System.out.println("Enter zip : ");
                        int newZip = scan.nextInt();
                        person.zip = newZip;
                        break;
                    case 7:
                        System.out.println("Enter phone Number : ");
                        long new_phoneNumber = scan.nextLong();
                        person.phone_number = new_phoneNumber;
                        break;
                    case 8:
                        System.out.println("Enter email : ");
                        String new_email = scan.next();
                        person.email = new_email;
                        break;
                    default:
                        System.out.println("invalid choice");
                }
                break;
            }
        }
        if (flag == false) {
            System.out.println(enteredName + " Not Found!");
        }
    }
    //contact delete method to delete the contact
    public void deleteContact() {
        System.out.println("Enter name wants to delete:");
        String firstName = scan.next();
        boolean flag = false;
        for (ContactPerson person : contact) {
            if (person.first_name.equals(firstName)) {
                flag = true;
                contact.remove(person);
            }
        }
        if (flag == false) {
            System.out.println("Name not found");
        }
    }

}


