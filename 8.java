import java.sql.*;
import java.util.*;
public class ReadB {
    
    private static void listDrivers() {
        Enumeration driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()) {
          Driver driverClass = (Driver) driverList.nextElement();
          System.out.println("   "+driverClass.getClass().getName());
        }
    }
        
        public static void main(String [] args) {
            Connection con = null;
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("After loading SQLServerDriver:");
                listDrivers();
                 
                final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
                final String USER = "root";
                final String PASS = "123"; 
                
                final String DB_URL = "jdbc:mysql://127.0.0.1:3306/books";
               // System.setProperty(JDBC_DRIVER,"");

               con = DriverManager.getConnection(DB_URL,USER,PASS);    
               System.out.println("Connected with default host.");
               Statement stmt=con.createStatement();  
               ResultSetrs=stmt.executeQuery("select * from authors");  
               while(rs.next())  
               System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

    

            } catch (Exception e) {
              System.err.println("Exception: "+e.getMessage());
            }
          }
}


After loading SQL Server Driver
 com.mysql.cj.jdbc.Driver
Connected with default host

1 herbert1 herbert@gmail.com
2  shld shldt@gmail.com
3  javaCompl java@gmail.com