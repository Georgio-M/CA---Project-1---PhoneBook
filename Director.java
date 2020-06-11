package Project1;
import java.util.Scanner;

public class Director {
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
            if(contacts[i].getFirstName().equals(first)){
                counter++;
            }
        }
        Contact[] newArray = new Contact[counter];
        int x = 0;
        for(int j = 0; j < contacts.length; j++){
            if(contacts[j].getFirstName().equals(first)){
                newArray[x] = contacts[j];
                x++;
            }
        }
        return newArray;
    }

    public Contact[] getByLastName(String last){
        int counter = 0;
        for(int i = 0; i < contacts.length; i++){
            if(contacts[i].getLastName().equals(last)){
                counter++;
            }
        }
        Contact[] newArray = new Contact[counter];
        int x = 0;
        for(int j = 0; j < contacts.length; j++){
            if(contacts[j].getLastName().equals(last)){
                newArray[x] = contacts[j];
                x++;
            }
        }
        return newArray;
    }

    public Contact[] getFullName(String fullName) {
        int counter = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getFullName().equals(fullName)) {
                counter++;
            }
        }
        Contact[] newArray = new Contact[counter];
        int x = 0;
        for (int j = 0; j < contacts.length; j++) {
            if (contacts[j].getFullName().equals(fullName)) {
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

        System.out.println("1: Update first name");
        System.out.println("2: Update last name");
        System.out.println("3: Update street address");
        System.out.println("4: Update city address");
        System.out.println("5: Update state address");
        System.out.println("6: phone number");
        System.out.println("7: zip code");
        System.out.println("8: Exit Contact Updates");
        int choice1 = selection.nextInt();
        System.out.println();
        return choice1;


    }
}


