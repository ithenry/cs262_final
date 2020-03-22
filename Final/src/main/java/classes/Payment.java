package main.java.classes;

import javax.smartcardio.Card;

public class Payment{
    //attributes (members)
    private int CardNumber;
    private String CardType;
    private String CardExpiration;
    private String BillingAddress;
    private int OrderNumber;
    private int CustomerID;
    //Constructors

    //empty constructor
    public Payment(){

    }

    //contructor without id
    public Payment(String CardType, String CardExpiration, String BillingAddress){
        this.CardType = CardType;
        this.CardExpiration = CardExpiration;
        this.BillingAddress = BillingAddress;
    }

   //full contructor
     public Payment(int CardNumber, String CardType, String CardExpiration, String BillingAddress, int OrderNumber, int CustomerId){
         this.CardNumber = CardNumber;
         this.CardType = CardType;
         this.CardExpiration = CardExpiration;
        this.BillingAddress = BillingAddress;
        this.OrderNumber = OrderNumber;
        this.CustomerID = CustomerID;

    }   

    //operations (member functions)
    public int getCardNumber(){
        return CardNumber;
    }

    public String getCardType(){
        return CardType;
    }

    public String getCardExpiration(){
        return CardExpiration;
    }

    public String getBillingAddress(){
        return BillingAddress;
    }

    public int getOrderNumber(){
        return OrderNumber;
    }

    public int getCustomerID(){
        return CustomerID;
    }

    public void setCardType(String value){
        this.CardType = CardType;
    }

    public void setCardExpiration(String value){
        this.CardExpiration = CardExpiration;
    }

    public void setBillingAddress(String value){
        this.BillingAddress = BillingAddress;
    }

    public void printPaymentInfo(){
        System.out.println(CardType + CardExpiration + BillingAddress);
        }

    }
}