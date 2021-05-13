package com.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.addressbook.ContactDetailOperation.contact;

public class AddressBookMain {
    //Add an arraylist of contact person to Hashmap AddressBook
    public static Map<String, ArrayList<ContactPerson>> addressBookDetail = new HashMap<String, ArrayList<ContactPerson>>();
    static ContactDetailOperation contactDetail = new ContactDetailOperation();//object of ContactDetailOperation class is created
    public static Scanner scan = new Scanner(System.in);

    //------------------------Main Method-----------------------------------//
    public static void main(String args[]) {
        System.out.println("!!!Welcome to Address Book Program!!!");
        boolean flag = true;
        while (flag) {
            System.out.println("1.Add new Address Book \n 2.Exit");
            System.out.println("Enter your choice");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Name of Address book");
                    String addBookName = scan.next();
                    if (addressBookDetail.containsKey(addBookName)) {
                        System.out.println("Address Book already Exist!!");
                    } else {
                        addressBookDetail.put(addBookName, contact);
                        contactDetail.addAddressbook();
                        for (Map.Entry<String, ArrayList<ContactPerson>> Entry : addressBookDetail.entrySet()) {
                            System.out.println("Address Book Name:>" + Entry.getKey() + "==>" + "Contact Details:>" + Entry.getValue() + "==>");
                        }
                        break;
                    }
                case 2:
                    flag = false;
                    System.out.println("Exit");
                    break;
            }
        }

    }
}