package main.java;

import main.java.dam.Database;
import main.java.classes.Customer;
import main.java.classes.Order;
import main.java.dam.DamCustomer;
import main.java.dam.DamLineItem;
import main.java.dam.DamOrder;
import main.java.dam.DamPayment;
import main.java.dam.DamProduct;
class Main{
    public static void main(String[] args){
        //Instantiate Database -- Can't make a connection, log-in credentials are invalid
        Database db = new Database("192.154.227.17", "CGCC", 1444, "isaak_db", false, "isaak", "isaak7544!");
        //Instantiate Dam Classes - these queries will show all of the information
        Customer c = new DamCustomer(db).selectCustomerByID("1");
        LineItem ln = new DamLineItem(db).selectItemById("Fender Stratocaster", "1");
        Order o = new DamOrder(db).selectOrderByID("1");
        Product p = new DamProduct(db).selectProductByName("value");
        Payment pm = new DamPayment(db).selectPaymentByID("55555");

        System.out.println(db.getConnectionURL());
        o.printOrderInfo("1");
    }
}