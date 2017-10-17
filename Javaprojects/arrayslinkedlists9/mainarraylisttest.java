package arrayslinkedlists9;
import java.util.ArrayList;
import java.util.Scanner;

public class mainarraylisttest {

	private static Scanner scanner = new Scanner(System.in);				//Initate the scanner import
	private static Arraylist Grocerylist1  = new Arraylist();				//Creating new instance of the arraylist class
	
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
				 Grocerylist1.printgrocery();
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
				 	copygroceryarray();
			 case 7: 
				 quit = true;								//Will end the while loop.
				 break;
			 }
					 
		 }

	 }
	 
	 public static void printinstructions(){
		System.out.println("\n Press");
		System.out.println("\t 0 - To print out choice options.");
		System.out.println("\t 1 - To print the list of the grocery items");
		System.out.println("\t 2 - To add an item to the grocery list");
		System.out.println("\t 3 - To modify an item in the grocery list");
		System.out.println("\t 4 - To remove an item from the grocery list");
		System.out.println("\t 5 - To search for an item in the grocery list");
		System.out.println("\t 6 - To copy grocery array to an other array.");
		System.out.println("\t 7 - To quit application");
					
	 }
	 public static void additem(){
		 System.out.println("Please enter the grocery item: ");
		 Grocerylist1.addgrocery(scanner.nextLine());   				//Will process teh Grocerylist methods with the scanner input.
	 }
	 
	 public static void modifyitem(){
		 System.out.print("Please enter current item: ");
		 String currentitem = scanner.nextLine();								//Scannerinput for positon
		 scanner.nextLine();											//LineBreak
		 System.out.print("Enter replacement item ");
		 String newitem = scanner.nextLine();							//Scanner intput for line item name
		 Grocerylist1.modifygrocery(currentitem, newitem);					//calling the method of the grocerylist class.
		 
	 }
	 
	 public static void removeitem(){
		 System.out.print("Please enter item number to remove: ");
		 String itemno = scanner.nextLine();								//Scannerinput for positon
		 scanner.nextLine();
		 Grocerylist1.removegrocery(itemno);											
	 }
	 public static void searchitem(){
		 System.out.print("Item to search for");
		 String searchitem = scanner.nextLine();
		 if(Grocerylist1.searchgrocery(searchitem) >= 0){				//seargrocerymethod will result null if no item has been found.
			 System.out.println("Found " + searchitem + "in our grocery list");
		 }else{
			 System.out.println( searchitem + " Has not been found in our grocery list");
		 }
		 
	 }
	 public static void copygroceryarray(){
		 ArrayList<String> newarray = new ArrayList<String>();
		 newarray.addAll(Grocerylist1.getgroceryarray());							//This is how to copy the exsiting arraylist to a new one.
		 
		 //ArrayList<String> newarray2 = new ArrayList<String>(Grocerylist1.getgroceryarray()); //This is how to copy in 1 line
		 
		 //Copy everything to an array from an arraylist.
//		 String[] myarray = new String[Grocerylist1.getgroceryarray().size()];
//		 myarray = Grocerylist1.getgroceryarray().toArray(myarray);										
		 
		 
	 }
	 
	 
	    

	
}
