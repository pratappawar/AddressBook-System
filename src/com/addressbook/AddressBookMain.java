package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
   public static Scanner scan=new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("!!!Welcome to Address Book Program!!!");
        ContactDetailOperation contactDetail=new ContactDetailOperation();//object of ContactDetailOperation class is created
        System.out.println("Address Book Menu!!");
        System.out.println("1.Add contact");//choices for operation
        System.out.print("enter choice:");
        int choice=scan.nextInt();
        switch (choice){
            case 1:
                contactDetail.addContact();
                System.out.println("Contact Added Successfully!");
                break;
            default:
                System.out.println("Please Enter Valid Choice:");
                break;
        }
    }
}