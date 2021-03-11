package com.example.challenge;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static Scanner userInput=new Scanner(System.in);
    public static ArrayList<Contact> allContacts;
    public static ArrayList<Message> allMessages;

    public static void main(String[] args) {
         allContacts= new ArrayList<>();
        allMessages=new ArrayList<>();
        System.out.println("Enter your name \n");
        String EnterName=userInput.next();
        System.out.println("Hello "+ EnterName +"\n");

        initialOptions();


    }

    public static void initialOptions(){
        System.out.println("1.Manage contacts \n" +
                "2.Messages\n" +
                "3.Quit");
        Integer userChoice=userInput.nextInt();

        switch(userChoice){
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;
        }

    } //Initial options


    public static void manageContacts() {
        System.out.println("1.Show all Contacts \n" +
                "2.Add a new contact \n" +
                "3.Search for a contact\n" +
                "4.Delete a contact\n"+
                "5.Go back to the previous menu");
        Integer userChoice=userInput.nextInt();

        switch(userChoice){
            case 1:
                showContact();
                break;
            case 2:
                addContact();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                initialOptions();
                break;

        }


    } // End of manage contacts


    public static void showContact(){
        System.out.println("All contacts :");
        for (Contact c:allContacts){
            System.out.println(c.getDetails()+"\n");
        }
        manageContacts();
    } // Show contacts

    public static void addContact(){
        System.out.println("Enter contact name : \n");
        String contactName=userInput.next();
        System.out.println("Enter contact phone number : \n");
        String contactTel=userInput.next();
        System.out.println("Enter contact mail : \n");
        String contactEmail=userInput.next();


        if((contactName==" ") || (contactTel==null) ||  (contactEmail ==" ")){
            System.out.println("Details missing -- Enter all details");
            addContact();
        }

        else{
            Contact c1=new Contact (contactName,contactTel,contactEmail);
            allContacts.add(c1);
        }
        manageContacts();
    } // Add Contacts




    public static void searchContact(){
        System.out.println("Enter contact to search");
        String searchName=userInput.next();

        System.out.println("Searching Contact...");
        for(Contact c:allContacts){
            if(c.getName().equals(searchName)){
            System.out.print(c.getDetails()+"\n");
            manageContacts();
            }

            else{
                continue;
            }

        }
        System.out.print("Contact not found\n");
        manageContacts();
    } //Search contact


    public static void deleteContact(){
        System.out.println("Enter contact to search");
        String deleteName=userInput.next();
        System.out.println("Searching Contact...");
        Integer  indexCount;
        indexCount=0;
        for(Contact c:allContacts){

            /*System.out.println("test name: " + c.getName());
            System.out.println("test delete name: " + deleteName);*/
            if(c.getName().equals(deleteName)){
                System.out.println("Contact found");
                System.out.println("Removing this item\n" + allContacts.get(indexCount).getDetails());
                allContacts.remove(allContacts.get(indexCount));
                manageContacts();
            }
            else{
                indexCount+=1;
                continue;

            }

         }

        System.out.print("Contact not found\n");
        manageContacts();
    }


    public static void manageMessages() {
        System.out.println("1.See my messages\n" +
                "2. Send message\n"+
                "3. Go back to main menu");
        Integer userChoice=userInput.nextInt();

        switch (userChoice){
            case 1:
                seeMessages();
                break;
            case 2:
                sendMessage();
                break;
            default:
                initialOptions();
                break;


        }

    }

    public static void seeMessages(){
        for (Message m:allMessages){
        System.out.println(m.getMessageDetails()+"\n");
        }
        manageMessages();
    }


    public static void sendMessage(){
        System.out.println("Enter Message:");
        String UserMessage=userInput.next();

        System.out.println("Enter recipient:");
        String UserReceiver=userInput.next();

        UUID messsageId= UUID.randomUUID();

        if((UserMessage=="")|| (UserReceiver== "") ){
            System.out.println("Something is missing . Enter message and recipient");
            manageMessages();
        }

        Message m1= new Message (messsageId,UserReceiver,UserMessage);
        allMessages.add(m1);
        manageMessages();
    }



}
