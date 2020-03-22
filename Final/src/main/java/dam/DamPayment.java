package main.java.dam;

//import sql libraries and package classes
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.classes.Payment;


public class DamPayment{
    private Database database;

    public DamPayment(Database database){
        this.database = database;
    }
    //Create SQL Query in Java
    public Payment selectPaymentByID(String value){
        String sql = "SELECT *"     
                        + " FROM "
                            + "final_PAYMENT" 
                        + " WHERE "
                            +   "CardNumber='"
                            +   value
                            + "'" ;
    
        try (Connection connection = database.connection(); Statement statement = database.connection().createStatement();) {
            // Create and execute a SELECT SQL statement.
            ResultSet rs = statement.executeQuery(sql);
            Payment pm = new Payment();
            while(rs.next()){
                pm.setCardType(rs.getString("CardType"));
                pm.setCardExpiration(rs.getString("CardExpiration"));
                pm.setBillingAddress(rs.getString("BillingAddress"));
            }
            // return result set
            return pm;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}