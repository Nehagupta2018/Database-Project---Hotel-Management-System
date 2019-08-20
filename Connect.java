import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
 
public class Connect 
{ 
 
   public static Connection getConnection() throws SQLException
   {  
       Connection conn = null;  
       try
       {    
           String url = "jdbc:mysql://localhost:3306/HotelManagementSystem?useSSL=false&allowPublicKeyRetrieval=true";
           String user = "root";   
           String password = "root";  
           conn =  DriverManager.getConnection(url, user, password);  
       }
       
       catch(SQLException e)
       {    
           e.printStackTrace(); 
       }     
       return conn;   
   } 
 
    public static void test()
    {  
        try 
        {   
            Connection conn = getConnection();  
            if (conn!=null)     
                System.out.println("Connection successful");   
            conn.close();  
        }
        catch(SQLException e)
            {    
                e.printStackTrace();  
            }    
    } 
 
    public static void main(String[] args)
    { 
        test();
                }
    }
