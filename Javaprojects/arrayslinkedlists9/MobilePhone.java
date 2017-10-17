package arrayslinkedlists9;

import java.util.ArrayList;

/**
 * Created by dev on 28/08/15.
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

 //so the parameter to the method is a contact class, with some private variable,
 //Check if the contact exists or not.
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;

    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition <0) {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition <0) {
            System.out.println(contact.getName() +", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

 //Returnin the index number of the element's position.
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

 //Loop through every contact name and check if one of them is equals for the contact name in question.
    private int findContact(String contactName) {
        for(int i=0; i<this.myContacts.size(); i++) {  		//Looping
            Contact contact = this.myContacts.get(i);  		//Temporary variable as a contact
            if(contact.getName().equals(contactName)) {		//using equals. check if the method of getname will bring the same result as the contact name 
                return i;
            }
        }
        return -1;
    }

 //Searching with contact paramater, avoid accessing any position number,contact name directly.
    public String queryContact(Contact contact) {
        if(findContact(contact) >=0) {
            return contact.getName();
        }
        return null;
    }
 //Searching with String paramater
    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                        this.myContacts.get(i).getName() + " -> " +
                        this.myContacts.get(i).getPhoneNumber());
        }

    }





















}
