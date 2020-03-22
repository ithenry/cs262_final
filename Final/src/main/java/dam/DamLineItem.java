package main.java.dam;

//import sql libraries and package classes
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Because this isn't importing correctly, there are errors in the rest of this class
import main.java.classes.LineItem;


public class DamLineItem{
    private Database database;

    public DamLineItem(Database database){
        this.database = database;
    }
    //Create SQL Query in Java
    public LineItem selectItemById(String value, String value2){
        String sql = "SELECT *"     
                        + " FROM "
                            + "final_LINEITEM" 
                        + " WHERE "
                            +   "ProductName='"
                            +   value
                            +   "' &&"
                            +   "OrderNumber="
                            +   value2
                            + "'" ;
    
        try (Connection connection = database.connection(); Statement statement = database.connection().createStatement();) {
            // Create and execute a SELECT SQL statement.
            ResultSet rs = statement.executeQuery(sql);
            LineItem ln = new LineItem();
            while(rs.next()){
                ln.setItemQuantity(rs.getString("ItemQuantity"));    
            }
            // return result set
            return ln;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}