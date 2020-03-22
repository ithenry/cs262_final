package main.java.dam;

//import sql libraries and package classes
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.classes.Product;


public class DamProduct{
    private Database database;

    public DamProduct(Database database){
        this.database = database;
    }
    //Create SQL Query in Java
    public Product selectProductByName(String value){
        String sql = "SELECT *" 
                        + " FROM "
                            + "final_PRODUCT" 
                        + " WHERE "
                            +   "ProductName='"
                            +   value
                            +   "'";
    
        try (Connection connection = database.connection(); Statement statement = database.connection().createStatement();) {
            // Create and execute a SELECT SQL statement.
            ResultSet rs = statement.executeQuery(sql);
            Product p = new Product();
            while(rs.next()){
                p.setListPrice(rs.getString("ListPrice"));
                p.setCategory(rs.getString("Category"));
                p.setDescription(rs.getString("Description"));
            }
            // return result set
            return p;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}