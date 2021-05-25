package com.addressbook;
import java.util.*;
import static com.addressbook.ContactDetailOperation.contact;

public class AddressBookMain {
    //Add an arraylist of contact person to Hashmap AddressBook
    public static Map<String, ArrayList<ContactPerson>> addressBookDetail = new HashMap<>();
    static ContactDetailOperation contactDetail = new ContactDetailOperation();//object of ContactDetailOperation class is created
    public static Scanner scan = new Scanner(System.in);

    /**
     * main
     * @param args
     */
    public static void main(String args[]) {
        System.out.println("!!!Welcome to Address Book Program!!!");
        boolean flag = true;
        while (flag) {
            System.out.println("1.Add new Address Book \n 2.Check Duplicate Entry \n 3.Search person by city \n 4. Search Person by State \n 5.Exit");
            System.out.println("Enter your choice");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Name of Address book");
                    String addBookName = scan.next();
                    if (addressBookDetail.containsKey(addBookName)) {
                        System.out.println("Address Book already Exist!!");
                    } else {
                        //addressBookDetail.put(addBookName, contact);
                        addAddressBook(addBookName);
                        break;
                    }
                case 2:
                    for (Map.Entry<String, ArrayList<ContactPerson>> entry : addressBookDetail.entrySet()) {
                        ArrayList<ContactPerson> value = entry.getValue();
                        System.out.println("Address Book Name: " + entry.getKey());
                        contactDetail.checkDuplicate();
                    }
                    break;
                case 3:
                    System.out.println("Enter Name of City: ");
                    String cityName = scan.next();
                    contactDetail.searchPersonByCity(cityName);
                    break;
                case  4:
                    System.out.println("Enter Name of State: ");
                    String stateName = scan.next();
                    contactDetail.searchPersonByState(stateName);

                case 5:
                    flag = false;
                    System.out.println("Exit");
                    break;
            }
        }
    }

    /**
     * Adding different address book
     * @param addBookName
     */
    public static void addAddressBook(String addBookName) {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("Address Book Menu!!");
            System.out.println("1.Add contact. \n 2.Edit contact. \n 3.Delete Contact \n 4.Exit");//choices for operation
            System.out.print("enter choice:");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    contactDetail.addContact();
                    contactDetail.showDetails();
                    System.out.println("Contact Added Successfully!");
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    contactDetail.editContact();
                    contactDetail.showDetails();
                    System.out.println("Contact edited Successfully");
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    contactDetail.deleteContact();
                    contactDetail.showDetails();
                    System.out.println("Contact Deleted Successfully");
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
        addressBookDetail.put(addBookName,contact);
        System.out.println(addBookName+" =>"+"Address Book Added Successfully");
    }
}
