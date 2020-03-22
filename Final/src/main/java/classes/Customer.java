package main.java.classes;

public class Customer{
    //attributes (members)
    private int CustomerID;
    private String FName;
    private String LName;
    private String Email;
    private String ShippingAddress;

    //Constructors

    //empty constructor
    public Customer(){

    }

    //contructor without id
    public Customer(String FName, String Lname, String Email, String ShippingAddress){
        this.FName = FName;
        this.LName = LName;
        this.Email = Email;
        this.ShippingAddress = ShippingAddress;
    }

   //full contructor
    public Customer(int CustomerID, String FName, String Lname, String Email, String ShippingAddress){
        this.CustomerID = CustomerID;
        this.FName = FName;
        this.LName = LName;
        this.Email = Email;
        this.ShippingAddress = ShippingAddress;

    }

    //operations (member functions)
    public int getCustomerID(){
        return CustomerID;
    }

    public String getFName(){
        return FName;
    }

    public String getLName(){
        return LName;
    }

    public String getEmail(){
        return Email;
    }
    public String getShippingAddress(){
        return ShippingAddress;
    }

    public void setFName(String value){
        this.FName = FName;
    }

    public void setLName(String value){
        this.LName = LName;
    }

    public void setEmail(String value){
        this.Email = Email;
    }

    public void setShippingAddress(String value){
        this.ShippingAddress = ShippingAddress;
    }

    public void printCustomerInformation(String value){
        System.out.println(FName + LName + Email + ShippingAddress);
    }
}