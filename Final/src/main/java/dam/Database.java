package main.java.dam;

//import sql libraries
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database{

    
    //attributes (members)
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String connectURL = "jdbc:sqlserver://";
    private String host;
    private int port;
    private String instance = "MSSQLSERVER";
    private Boolean integrated;
    private String dbName;
    private String dbUser;
    private String dbPassword;

    //constructor
    public Database(String host, String instance, int port, String dbName, Boolean integrated, String dbUser, String dbPassword) {
        //set the required attributes
        this.host = host;
        this.instance = instance;
        this.port = port;
        this.dbName = dbName;
        this.integrated = integrated;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;

        //generate the connection url
        connectURL = generateConnectURL();
    }

    //operations (member functions)
    /**
     * gets connection url to sql server
     * @return String to connect to sql server
     */
    public String getConnectionURL(){
        return connectURL;
    }

    /**
     * builds connection url to sql server
     * @return String to connect to sql server
     */
    private String generateConnectURL(){
        //init string builder
        StringBuilder sb = new StringBuilder();
        sb.append(this.connectURL);

        //append the connection properties
        sb.append(this.host);

        //if we're not using default instance, append it
        sb.append("\\");
        sb.append(this.instance);

        //if we're not using default port, append it
        if(port != 1433){
            sb.append(":");
            sb.append(this.port);
        }

        sb.append(";databaseName=");
        sb.append(this.dbName);

        sb.append(";integratedSecurity=");
        sb.append(this.integrated);

        
        //return the connection string
        return sb.toString();
    } //end private String generateConnectURL()

    public Connection connection(){
        try{
            Class.forName(this.driver);
            return DriverManager.getConnection(this.connectURL, this.dbUser, this.dbPassword);
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }    
}