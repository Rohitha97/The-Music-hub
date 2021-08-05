
package Model;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author RwB - Pc
 */
public class DBconnection {
 
    
    
    public static Connection getConnection() {
       Connection con=null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musichub","root","");
                
        }catch (Exception ex){
            System.out.println(ex.getMessage());
    }
    return con;
    }
   
    }



         