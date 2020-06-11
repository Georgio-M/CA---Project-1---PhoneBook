package Project1;

public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
    private long phoneNum;
    private Address address;

    public void getContact(){
        if(middleName.length() !=0){
            System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
        } else {
            System.out.println("Name: " + firstName + " " + lastName);
        }
        System.out.println(address.toString());
        System.out.println("Phone Number: "+ phoneNum);
        System.out.println("------------------------------------------");
    }

    public Contact(String firstName, String middleName, String lastName, Address address, long phoneNum){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.address = address;

        if(middleName != null) {
            this.fullName = firstName + " " + middleName + " " + lastName;
        }
        else{
            this.fullName = firstName + " " + lastName;
        }

    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getFullName(){
        return this.fullName;
    }
    public Address getAddress(){
        return this.address;
    }
    public long getPhoneNum(){
        return this.phoneNum;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public  void setAddress(Address address) {
        this.address = address;
    }
    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String fullNameToString(){
        return firstName + " " + lastName;

    }
}

