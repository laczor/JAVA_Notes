package arrayslinkedlists9;

import java.util.ArrayList;
/**
 *Arraylistmethods
 *arraylist.get
 *arraylist.set
 *arraylist.add
 *arraylist.size
 *arraylist.remove
 *arraylist.contains 		-Searching 1 item in the grocery list.
 *arraylist.indexof			-Searching 1 item's index position in the arraylist.
 */

public class Arraylist {

	private ArrayList<String> grocerylist = new ArrayList<String>();
	
	public void addgrocery (String item){
		grocerylist.add(item);		
	}
	public ArrayList<String> getgroceryarray(){
		return grocerylist;
	}
	
	private void removegrocery(int position){
		String theitem = grocerylist.get(position);
		grocerylist.remove(position);			
	}
	
    public void removegrocery(String item){                            //Overloaded methods, with different parameters.
    	int position = searchgrocery(item);
		if (position >=0){
			removegrocery(position);
		}
    }
	private void modifygrocery(int position,String item){
		grocerylist.set(position, item);
		System.out.println("The following grocery at position " + position + " has been modified to " + item);
	}
	public void modifygrocery(String currentitem, String item){								//Overloaded methods, with different parameters.
		int position = searchgrocery(currentitem);
		if (position >=0){
			modifygrocery(position,item);
		}
		grocerylist.set(position, item);
		System.out.println("The following grocery at position " + position + " has been modified to " + item);			
	}
	public void printgrocery(){
		//System.out.println("This big " + grocerylist.size() + " is the grocery list");
		for(int i=0;i<grocerylist.size();i++){
			System.out.println("Grocyerlist is " + (i+1) + grocerylist.get(i));
		}
	}
	public int searchgrocery(String searchitem){
	return grocerylist.indexOf(searchitem);				//SInce it is the first return, if it results a value, the second return will be disregarded.

	}
		
}



/*
 Original seargroceryitem
 
 	public String seargrocery(String searchitem){
//		boolean exists = grocerylist.contains(searchitem);	
        int position = grocerylist.indexOf(searchitem);
		if(position>=0){
			return grocerylist.get(position);				//SInce it is the first return, if it results a value, the second return will be disregarded.
		}
		return null;				//If the search won't find anything, the result should be 0.
	}
	
 * */
