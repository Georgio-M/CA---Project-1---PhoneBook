package Project1;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Project1.Directory directory = new Project1.Directory();

//Contacts Listing:
        Project1.Contact contact1 = new Project1.Contact("John", "", "Doe", new Address("114 Market St", "St Louis", "MO", 63403), 6366435697l);
        Project1.Contact contact2 = new Project1.Contact("John", "E", "Doe", new Address("324 Main Street", "St. Charles", "MO", 63303), 6366435696l);
        Project1.Contact contact3 = new Project1.Contact("John", "Michael West", "Doe", new Address("574 Pole ave", "St. Peters", "MO", 63333), 6366435789l);

// adding contacts
        directory.addContact(contact1);
        directory.addContact(contact2);
        directory.addContact(contact3);

//Searching for existing contact
        Scanner input = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);

// System prompt
        int menuOption = 0;
        while (menuOption < 11) {
            directory.getMenu();
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    System.out.println("Please enter first name: ");
                    String case1 = input.next();
                    directory.printContactsList(directory.getByFirstName(case1));
                    break;

                case 2:
                    System.out.println("Please enter a last name ");
                    String case2 = input.next();
                    directory.printContactsList(directory.getByLastName(case2));
                    break;

                case 3:
                    System.out.println("Please enter a full name following the below format:\n"+"\"First Name\" \"Middle Name\" \"Last Name\"");
                    String case3 = userInput.nextLine();
                    directory.printContactsList(directory.getFullName(case3));
                    break;

                case 4:
                    System.out.println("Please enter an phone number ");
                    long case4 = input.nextLong();
                    directory.getByPhoneNum(case4).getContact();
                    break;

                case 5:
                    System.out.println("Please enter state in 2 charters");
                    String case5 = userInput.nextLine();
                    //directory.printContactsList(directory.getFullName(case3));
                    directory.printContactsList(directory.getByState(case5));
                    break;

                case 6:
                    System.out.println("Please enter a contact using the below format\n"+"\"John Doe, 114 Market St, St Louis, MO, 63403, 6366435698\"");
                    String contact = userInput.nextLine();
                    String newContact[] = contact.split(",");
                    String name = newContact[0];
                    String street = newContact[1];
                    String city = newContact[2];
                    String state = newContact[3];
                    String zip = newContact[4].trim();
                    long phoneNum = Long.parseLong(newContact[5].trim());
                    String[] splitName = name.split(" ");
                    String firstName = splitName[0];
                    String middleName = "";

                    if(splitName.length == 4) {
                        int i;
                        for (i = 1; i < splitName.length - 1; i++) {
                            middleName = splitName[i - 1] + " " + splitName[i];
                        }

                    }else if(splitName.length == 3){
                        int i;
                        for (i = 1; i < splitName.length - 1; i++);
                        middleName = splitName[i - 1];
                    }

                    String lastName = splitName[splitName.length -1];
                    Address address = new Address(street, city, state, Integer.parseInt(zip));
                    Project1.Contact doneContact = new Project1.Contact(firstName, middleName, lastName, address, phoneNum);
                    directory.addContact(doneContact);
                    break;

                case 7:
                    System.out.println("Please provide the phone number of the contact you would like to delete ");
                    long case7 = input.nextLong();
                    directory.removeContact(directory.getByPhoneNum(case7));
                    break;

                case 8:
                    int updateSelection = 0;
                    System.out.println("Please enter the phone number of the contact you would like to update: ");
                    long phoneSearch = input.nextLong();


                    while(updateSelection != 5){
                        updateSelection = directory.getUpdateMenu();
                        //directory.getUpdateMenu();

                        switch(updateSelection){
                            case 1:
                                System.out.println("Please enter new first name: ");
                                String newFirst = input.next();
                                directory.getByPhoneNum(phoneSearch).setFirstName(newFirst);
                                break;

                            case 2:
                                System.out.println("Please enter new last name: ");
                                String newLast = input.next();
                                directory.getByPhoneNum(phoneSearch).setLastName(newLast);
                                break;

                            case 3:
                                System.out.println("Please enter new middle name: ");
                                String newMiddleName = input.next();
                                directory.getByPhoneNum(phoneSearch).setMiddleName(newMiddleName);
                                break;

                            case 4:
                                System.out.println("Please enter new phone number ");
                                long newPhone = input.nextLong();
                                directory.getByPhoneNum(phoneSearch).setPhoneNum(newPhone);
                                break;
                            case 5:
                                System.out.println("Main Menu");

                        }

                    }

                case 9:
                    System.out.println("------------------ All Contacts: ---------------------");
                    directory.printContactsList(directory.contacts);
                    break;

                case 10:
                    System.out.println("Exit ");
                    return;


            }
        }
    }
}

