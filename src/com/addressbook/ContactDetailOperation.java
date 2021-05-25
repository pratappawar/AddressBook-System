package com.addressbook;
import java.util.*;
import java.util.stream.Collectors;

public class ContactDetailOperation {
    //add contact in arraylist
    public static ArrayList<ContactPerson> contact = new ArrayList<ContactPerson>();
    static Scanner scan = new Scanner(System.in);
    public ContactDetailOperation value;

    /**
     * Adding contact in address book
     */
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

    /**
     * show contact details
     */
    public void showDetails(){
        for (int i = 0; i < contact.size(); i++) {
            System.out.println(contact.get(i));
        }
    }

    /**
     * edit contact method called from main method
     */
    public void editContact() {
        System.out.println("Enter the name you want to edit:");
        String enteredName = scan.next();
        boolean flag = false;
        for (ContactPerson person : contact) {
            if (person.getFirst_name().equals(enteredName)) {
                flag = true;
                System.out.println("1. First Name\n" + "2.Last Name\n" + "3.Address\n" + "4.city\n" + "5.State\n" + "6.zip\n" + "7.phoneNumber\n" + "8.email");
                System.out.println("Enter your choice:");
                int choice = scan.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Enter First Name : ");
                        String firstName = scan.next();
                        person.setFirst_name(firstName);
                        break;
                    case 2:
                        System.out.println("Enter First Name : ");
                        String lastName = scan.next();
                        person.setLast_name(lastName);
                        break;
                    case 3:
                        System.out.println("Enter Address : ");
                        String newAddress = scan.next();
                        person.setAddress(newAddress);
                        break;
                    case 4:
                        System.out.println("Enter city : ");
                        String newCity = scan.next();
                        person.setCity(newCity);
                        break;
                    case 5:
                        System.out.println("Enter State : ");
                        String newState = scan.next();
                        person.setState(newState);
                        break;
                    case 6:
                        System.out.println("Enter zip : ");
                        int newZip = scan.nextInt();
                        person.setZip(newZip);
                        break;
                    case 7:
                        System.out.println("Enter phone Number : ");
                        long new_phoneNumber = scan.nextLong();
                        person.setPhone_number(new_phoneNumber);
                        break;
                    case 8:
                        System.out.println("Enter email : ");
                        String new_email = scan.next();
                        person.setEmail(new_email);
                        break;
                    default:
                        System.out.println("invalid choice");
                }
                break;
            }
        }
        if (flag == false) {
            System.out.println(enteredName + " Not Found!");
        }else{
            System.out.println("Contact Edited Successfully");
        }
    }

    /**
     * contact delete method to delete the contact
     */
    public void deleteContact() {
        System.out.println("Enter name wants to delete:");
        String firstName = scan.next();
        boolean flag = false;
        for (ContactPerson personDetail : contact) {
            if (personDetail.first_name.equals(firstName)) {
                contact.remove(personDetail);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println(firstName+"Name not found");
        }else{
            System.out.println("Contact Deleted successfully");
        }
    }

    /**
     * check duplicate contact in Address book if it is find will show the result
     */
    public static void checkDuplicate() {
        Set<String> ContactSet = new HashSet<>();
        Set<ContactPerson> newSet = contact.stream().filter(n -> !ContactSet.add(n.getFirst_name())).collect(Collectors.toSet());
        for (ContactPerson contact : newSet) {
            System.out.println("The Duplicate Contact is: " + contact.getFirst_name() + " " + contact.getLast_name());
        }
    }

    /**
     * Adding different address book
     */
    public  void addAddressbook() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("Address Book Menu!!");
            System.out.println("1.Add contact. \n 2.Edit contact. \n 3.Delete Contact \n 4.Exit");//choices for operation
            System.out.print("enter choice:");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    addContact();
                    showDetails();
                    System.out.println("Contact Added Successfully!");
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    editContact();
                    showDetails();
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    deleteContact();
                    showDetails();
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    isFlag = false;
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Please Enter Valid Choice:");
                    break;
            }
        }
    }
}

