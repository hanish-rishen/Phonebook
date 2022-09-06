package com.hanish.java;
import java.util.*;
public class Phonebook {

    public static void main(String[] args) {

        HashMap<String, String> directory = new HashMap<>();
        System.out.println("Welcome to your Phonebook");
        Scanner s = new Scanner(System.in);
        int choice=0;
        while (choice != 3) {
            System.out.println("Type 1 for Adding a contact or Type 2 for searching a contact or Type 3 to quit");
            choice = s.nextInt();
            if (choice == 1) {
                System.out.println("Please enter the Contact Name that you want to add:");
                String name = s.next();
                System.out.println("Please enter the Contact Number that you want to add:");
                String number = s.next();
                if(directory.get(name) == null) {
                    directory.put(name, number);
                    System.out.println("Contact Added Successfully");
                }
                else{
                    System.out.println("Contact with same name already exists, please try again");
                }

            } else if (choice == 2) {
                System.out.println("Please enter the Contact Name that you want to Search:");
                String name = s.next();
                String number = directory.get(name);
                if(number != null){
                    System.out.println("Your Contact's Phone Number is:");
                    System.out.println(number);
                }
                else{
                    System.out.println("No such contact exists, try again");
                }
            }
        }
    }
}