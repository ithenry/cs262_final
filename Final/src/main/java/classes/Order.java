package main.java.classes;

public class Order{

    //attributes
    public int OrderNumber;
    public String OrderDate;
    public String OrderPrice;
    public String DateShipped;
    public String DiscountAmmount;
    public float ShippingCost;
    public float DiscountPercentage;
    public String Tax;
    public int CustomerID;
    public int CardNumber;

    //empty constructor

    public Order(){
    }

    //Constructor without Primary Keys


    public Order(String OrderDate, String OrderPrice, String DateShipped, String DiscounAmount, float ShippingCost, float DiscountPercentage, String Tax){
        this.OrderDate = OrderDate;
        this.OrderPrice = OrderPrice;
        this.DateShipped = DateShipped;
        this.DiscountAmmount = DiscounAmount;
        this.ShippingCost = ShippingCost;
        this.DiscountPercentage = DiscountPercentage;
        this.Tax = Tax;
    }

    public Order(int OrderNumber, String OrderDate, String OrderPrice, String DateShipped, String DiscounAmount, float ShippingCost, float DiscountPercentage, String Tax, int CustomerID, int CardNumber){
        this.OrderNumber = OrderNumber;
        this.OrderDate = OrderDate;
        this.OrderPrice = OrderPrice;
        this.DateShipped = DateShipped;
        this.DiscountAmmount = DiscounAmount;
        this.ShippingCost = ShippingCost;
        this.DiscountPercentage = DiscountPercentage;
        this.Tax = Tax;
        this.CustomerID = CustomerID;
        this.CardNumber = CardNumber;
    }

    //Member functions (getters and setters)

    public int getOrderNumber(){
        return OrderNumber;
    }

    public String getOrderDate(){
        return OrderDate;
    }

    public String getOrderPrice(){
        return OrderPrice;
    }

    public String getDateShipped(){
        return DateShipped;
    }

    public String getDiscountAmmount(){
        return DiscountAmmount;
    }

    public float getShippingCost(){
        return ShippingCost;
    }

    public float getDiscountPercentage(){
        return DiscountPercentage;
    }

    public String getTax(){
        return Tax;
    }

    public int getCustomerID(){
        return CustomerID;
    }

    public int getCardNumber(){
        return CardNumber;
    }

    public void setOrderDate(String value){
        this.OrderDate = OrderDate;
    }

    public void setOrderPrice(String value){
        this.OrderPrice = OrderPrice;
    }

    public void setDateShipped(String value){
        this.DateShipped = DateShipped;
    }

    public void setDiscountAmount(String value){
        this.DiscountAmmount = DiscountAmmount;
    }

    public void setShippingCost(Float value){
        this.ShippingCost = ShippingCost;
    }

    public void setDiscountPercentage(Float value){
        this.DiscountPercentage = DiscountPercentage;
    }

    public void setTax(String value){
        this.Tax = Tax;
    }

    public void printOrderInfo(String value){
        System.out.println(OrderDate + OrderPrice + DateShipped + DiscountAmmount + ShippingCost + DiscountPercentage + Tax);
    }
}