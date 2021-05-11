package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("!!!Welcome to Address Book Program!!!");
        ContactDetailOperation contactDetail = new ContactDetailOperation();//object of ContactDetailOperation class is created
        System.out.println("Address Book Menu!!");
        while (true) {
            System.out.println("1.Add contact. \n 2.Edit contact. \n 3.Delete Contact");//choices for operation
            System.out.print("enter choice:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    contactDetail.addContact();
                    System.out.println("Contact Added Successfully!");
                    break;
                case 2:
                    contactDetail.editContact();
                    contactDetail.dispalyContact();
                    System.out.println("Contact edited Successfully");
                    break;
                case 3:
                    contactDetail.deleteContact();
                    contactDetail.dispalyContact();
                    System.out.println("Contact Deleted Successfully");
                    break;
                default:
                    System.out.println("Please Enter Valid Choice:");
                    break;
            }
        }
    }
}