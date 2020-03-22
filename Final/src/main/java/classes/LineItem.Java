package main.java.classes;

public class LineItem{

    //attributes
    private String ProductName;
    private int OrderNumber;
    private int ItemQuantity;

    //empty constructor

    public LineItem(){

    }

    //Constructor w/o id

    public LineItem(int ItemQuantity){
        this.ItemQuantity = ItemQuantity
    }

    //Full Constructor

    public LineItem(String ProductName, int OrderNumber, int ItemQuantity){
        this.ProductName = ProductName;
        this.OrderNumber = OrderNumber;
        this.ItemQuantity = ItemQuantity;
    }

    //Member Functions

    public String getProductName(){
        return ProductName;
    }

    public int getOrderNumber(){
        return OrderNumber;
    }

    public int getItemQuantity(){
        return ItemQuantity;
    }

    public void setItemQuantity(int value){
        this.ItemQuantity = ItemQuantity;
    }


}
