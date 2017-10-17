package arrayslinkedlists9;

import java.util.ArrayList;

public class MobileContacts {
	
	private ArrayList<String> contactlist = new ArrayList<String>();
	
	public void additem(String name){
		contactlist.add(name);
 }
	public int searchitem(String item){
		return contactlist.indexOf(item);
	}
//Public subs, which are using the private subs procedures	
	public void removecontact(String contact){
		if (searchitem(contact) >=0){
			removeitem(contact);
	       }
    }
	public void modifycontact(String contact){				//So there is a validation before accessing the database, 
		if (searchitem(contact) >=0){					    //if there is an item in the list, then it will call the private sub which will make to changes in the arraylist.
			modifyitem(contact);
	       }
    }
	public void printcontact(int i){
		System.out.print("Contact name: " + contactlist.get(i) + " ");
}
	public int contactlistsize(){
		return contactlist.size();
	}
//Private subs, which modifies the contact lists	
	private void removeitem(String item){
		contactlist.remove(contactlist.indexOf(item));
	}
	private void modifyitem(String item){
		contactlist.set(contactlist.indexOf(item),item);
		}
	
}
