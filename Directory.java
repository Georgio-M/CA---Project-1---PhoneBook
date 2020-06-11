package Project1;

import java.util.Scanner;

public class Directory {
    Contact[] contacts = new Contact[0];
    Address[] address = new Address[0];


    public void addContact(Contact newContact){
        Contact[] temp = new Contact[contacts.length + 1];
        for(int i = 0; i < contacts.length; i++){
            temp[i] = contacts[i];
        }
        temp[temp.length - 1] = newContact;
        contacts = temp;
    }

    public Contact[] getContactsList() {
        return contacts;
    }

    public void setContactList(Contact[] contact) {
        this.contacts = contact;

    }


    public void printContactsList(Contact[] searched) {
        for (int i = 0; i < searched.length; i++) {
            searched[i].getContact();
        }
    }

    public void printAddressList(Address[] findAddress){
        for(int i = 0; i < findAddress.length; i++){
            findAddress[i].toString();
        }
    }

    public Contact getByPhoneNum(long phoneNum){
        int reference = 0;
        for(int i = 0; i < contacts.length; i++){
            if (contacts[i].getPhoneNum() == phoneNum){
                reference = i;
                break;
            }
        }
        return contacts[reference];
    }

    public void removeContact(Contact removed){
        Contact[] temp = new Contact[contacts.length -1];
        int x = 0;
        for(int i = 0; i < contacts.length; i++){
            if(contacts[i] != removed){
                temp[x] = contacts[i];
                x++;
            }
        }
        contacts = temp;
    }

    public Contact[] getByFirstName(String first){
        int counter = 0;
        for(int i = 0; i < contacts.length; i++){
            if(contacts[i].getFirstName().toLowerCase().equals(first)){
                counter++;
            }
        }
        Contact[] newArray = new Contact[counter];
        int x = 0;
        for(int j = 0; j < contacts.length; j++){
            if(contacts[j].getFirstName().toLowerCase().equals(first)){
                newArray[x] = contacts[j];
                x++;
            }
        }
        return newArray;
    }

    public Contact[] getByLastName(String last){
        int counter = 0;
        for(int i = 0; i < contacts.length; i++){
            if(contacts[i].getLastName().toLowerCase().equals(last)){
                counter++;
            }
        }
        Contact[] newArray = new Contact[counter];
        int x = 0;
        for(int j = 0; j < contacts.length; j++){
            if(contacts[j].getLastName().toLowerCase().equals(last)){
                newArray[x] = contacts[j];
                x++;
            }
        }
        return newArray;
    }

    public Contact[] getFullName(String fullName) {
        int counter = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getFullName().toLowerCase().equals(fullName)) {
                counter++;
            }
        }
        Contact[] newArray = new Contact[counter];
        int x = 0;
        for (int j = 0; j < contacts.length; j++) {
            if (contacts[j].getFullName().toLowerCase().equals(fullName)) {
                newArray[x] = contacts[j];
                x++;
            }
        }
        return newArray;
    }
    public Contact[] getByState(String state){
        int counter = 0;
        for(int i = 0; i < contacts.length; i++){
            if(contacts[i].getAddress().getState().toLowerCase().equals(state.toLowerCase())){
                counter++;
            }
        }
        Contact[] newArray = new Contact[counter];
        int x = 0;
        for(int j = 0; j < contacts.length; j++){
            if(contacts[j].getAddress().getState().toLowerCase().equals(state.toLowerCase())){
                newArray[x] = contacts[j];
                x++;
            }
        }
        return newArray;
    }

    public static int getUpdateMenu(){
        Scanner selection = new Scanner(System.in);

        System.out.println("1: Update First Name");
        System.out.println("2: Update Last");
        System.out.println("3: Update Middle Name");
        System.out.println("4: Update Phone Number");
        System.out.println("5: Back to Main Menu");
        int choice1 = selection.nextInt();
        System.out.println();
        return choice1;
    }

    public static void getMenu(){
        System.out.println("-  Phone Book Application  -\n\n" + "1: Search: First Name\n" + "2: Search: Last Name\n" + "3: Search: Full Name\n" + "4: Search: Phone Number\n" +"5: Search: State\n" + "6: Add Contact\n" + "7: Delete Contact\n" + "8: Update Contacts \n" + "9: View All Contacts\n" + "10: Exit Application");
    }
}
