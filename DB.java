/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER N026
 */
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.util.logging.Logger;
public class DB {
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "java_library_system";
    private static Integer portNumber=3306;
    private static String password ="";//no pw
    //create function to creare and return the connection
    public static Connection getConnection(){
    Connection connection = null;
    MysqlDataSource = new MysqlDataSource();
    datasource.setServerName(serverName);
    datasource.setUser(userName);
    datasource.setDatabaseName(dbName);
    datasource.setPortNumber(portNumber);
    datasource.setPassword(password);
    try{
    connection = datasource.getConnection{};}
    catch(SQLException ex){
    Logger.getLogger(DB.class.getName()).log(Level.SEVERE,null,ex);}
    
    return connection;
    }
}
