package arrayslinkedlists9;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilephoneMAIN {

	private static Scanner scanner = new Scanner(System.in);				//Initate the scanner import
	private static MobileContacts Contactnames  = new MobileContacts();				//Creating new instance of the arraylist class
	private static MobileContactsphone Contactsphone  = new MobileContactsphone();		//Creating new instance of the arraylist class
	
	//Main method.
	public static void main (String[] args){
		 boolean quit = false;
		 int choice = 0;
		 printinstructions();
		 while(!quit){										//It will run until it won't be false.
			 System.out.println("Enter your choice");
			 choice = scanner.nextInt();
			 scanner.nextLine();							//Linebreak		
			 
			 switch(choice){								//By selecting the choic, you can choose which methods, you would like to use.
			 case 0:
				 printinstructions();
				 break;
			 case 1:
				 printcontacts();
				 break;
			 case 2:
				 additem();
				 break;
			 case 3: 
				 modifyitem();
				 break;
			 case 4:
				 removeitem();
				 break;
			 case 5: searchitem();
				 break;
			 case 6: 
				 quit = true;								//Will end the while loop.
				 break;
			 }
					 
		 }

	 }
	 //Basedata
	 public static void printinstructions(){
		System.out.println("\n Press");
		System.out.println("\t 0 - To print out choice options.");
		System.out.println("\t 1 - To print Contact List");
		System.out.println("\t 2 - To add to new contact");
		System.out.println("\t 3 - To modify contact");
		System.out.println("\t 4 - To remove contact");
		System.out.println("\t 5 - To search for a contact");
		System.out.println("\t 6 - To quit application");
					
	 }
	 public static void printcontacts(){
		 int size = Contactnames.contactlistsize();				//Will loop through all of the contactlists, and call the printcontact method for both contact,phone arraylist.
			for(int i=0;i<size;i++){
				Contactnames.printcontact(i);
				Contactsphone.printcontact(i);
				System.out.println("");
			}
	 }
	 public static void additem(){
		 System.out.println("Please enter a contact name:");
		 Contactnames.additem(scanner.nextLine());   				//Will add contact to the contactarraylist.
		 System.out.println("Please enter a phone number:");
		 Contactsphone.additem(scanner.nextLine());   				//Will add contact to the contacphone arraylist
		 
	 }
	 public static void modifyitem(){
		 System.out.println("Please enter a contact name to be modified:");
		 String name = scanner.nextLine();							//Get the contactname
		 int number = Contactnames.searchitem(name);				//Check the indexnumber of it.
		 
		 //Check if it exists at all
			if (number >=0){
				 System.out.println("Please enter the new contact name:");
				 Contactnames.modifycontact(scanner.nextLine());  				//Will add contact to the contactarraylist.
		//Ask for phone number modification as well.	
			 System.out.println("Would you like to modify the phone number? 1-Yes,2-No");
			 int changing = scanner.nextInt();
			 scanner.nextLine();				//Important to include, so the next scanner won't be skipped.
				 if (changing == 1){			//If response is 1 == modify phone
					 System.out.println("Please enter the new phone number:");
					 String phonenumber = scanner.nextLine();
					 Contactsphone.modifycontact(number, phonenumber);
				 }
		    }
			else{
		     System.out.println("no contact has been found with" + name);
			}
		 System.out.println("Modificiation has been finished.");	
	 }
	 public static void removeitem(){
		 System.out.println("Please enter a contact name to be deleted:");
		 String name = scanner.nextLine();							//Get the contactname
		 int number = Contactnames.searchitem(name);				//Check the indexnumber of it.
		 
		 //Check if it exists at all
			if (number >=0){
				 Contactnames.removecontact(name);  				//Will add contact to the contactarraylist.
			     Contactsphone.removecontact(number);
		    }
			else{
		     System.out.println("no contact has been found with" + name);
			}
		 System.out.println("Contact has been deleted.");	
	 }
	public static void searchitem(){
		 System.out.println("Please enter a contact name to be searched:");
		 String name = scanner.nextLine();							//Get the contactname
		 int number = Contactnames.searchitem(name);
		 if (number >=0){
				Contactnames.printcontact(number);
				Contactsphone.printcontact(number);
				System.out.println("");
	     }
		 else{
	     System.out.println("no contact has been found with" + name);
		}
	}	 
}
