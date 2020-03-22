package main.java.dam;

//import sql libraries and package classes
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.classes.Customer;


public class DamCustomer{
    private Database database;

    public DamCustomer(Database database){
        this.database = database;
    }
    //Create SQL Query in Java
    public Customer selectCustomerByID(String value){
        String sql = "SELECT *" 
                        + " FROM "
                            + "final_CUSTOMER" 
                        + " WHERE "
                            +   "CustomerID='"
                            +   value
                            +   "'";
    
        try (Connection connection = database.connection(); Statement statement = database.connection().createStatement();) {
            // Create and execute a SELECT SQL statement.
            ResultSet rs = statement.executeQuery(sql);
            Customer c = new Customer();
            while(rs.next()){
                c.setFName(rs.getString("FName"));
                c.setLName(rs.getString("LName"));
                c.setEmail(rs.getString("Email"));
                c.setShippingAddress(rs.getString("ShippingAddress"));
            }
            // return result set
            return c;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}