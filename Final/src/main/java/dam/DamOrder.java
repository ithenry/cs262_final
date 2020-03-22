package main.java.dam;

//import sql libraries and package classes
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.classes.Order;


public class DamOrder{
    private Database database;

    public DamOrder(Database database){
        this.database = database;
    }
    //Create SQL Query in Java
    public Order selectOrderByID(String value){
        String sql = "SELECT *" 
                        + " FROM "
                            + "final_ORDER" 
                        + " WHERE "
                            +   "OrderNumber='"
                            +   value
                            +   "'";
    
        try (Connection connection = database.connection(); Statement statement = database.connection().createStatement();) {
            // Create and execute a SELECT SQL statement.
            ResultSet rs = statement.executeQuery(sql);
            Order o = new Order();
            while(rs.next()){
                o.setOrderDate(rs.getString("OrderDate"));
                o.setOrderPrice(rs.getString("OrderPrice"));
                o.setDateShipped(rs.getString("DateShipped"));
                o.setDiscountAmount(rs.getString("DiscountAmount"));
                o.setShippingCost(rs.getFloat("ShippingCost"));
                o.setDiscountPercentage(rs.getFloat("DiscountPercentage"));
                o.setTax(rs.getString("Tax"));
            }
            // return result set
            return o;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}