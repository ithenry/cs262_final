package main.java.classes;

public class Product{
    //attributes (members)
    private String ProductName;
    private Float ListPrice;
    private String Category;
    private String Description;

    //Constructors

    //empty constructor
    public Product(){

    }

    //contructor without id
    public Product(Float ListPrice, String Category, String Description){
        this.ListPrice = ListPrice;
        this.Category = Category;
        this.Description = Description;
    }

   //full contructor
    public Product(String ProductName, float ListPrice, String Category, String Description){
        this.ProductName = ProductName;
        this.ListPrice = ListPrice;
        this.Category = Category;
        this.Description = Description;
    }

    //member functions (getters and setters)
    public Float getListPrice(){
        return ListPrice;
    }

    public String getCategory(){
        return Category;
    }

    public String getDescription(){
        return Description;
    }

    public String getProductName(){
        return ProductName;
    }

    public void setListPrice(String value){
        this.ListPrice = ListPrice;
    }

    public void setCategory(String value){
        this.Category = Category;
    }

    public void setDescription(String value){
        this.Description = Description;
    }

    public void printProductInfo(String value){
        System.out.println(ListPrice + Category + Description);
    }
}