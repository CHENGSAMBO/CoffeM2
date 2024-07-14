
package coffee;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
public class InsertDataInDB {
    public static void main(String args[]){
        String url="navicat://conn.mysql@local/DC141Debdd9785bd?Conn.Host=localhost&Conn.Name=M2_Caffee&Conn.Port=3306&Conn.UseHTTP=false&Conn.UseSSH=false&Conn.UseSSL=false&Conn.UseSocketFile=false&Conn.Username=sambo";
        String user="Cheng Sambo";
        String password="sambo123";
        
        Connection conn=null;
        Statement stmt=null;
        
        try{
            // Getting a connection to database
           conn=DriverManager.getConnection(url,user,password); 
           // creating the sql statement
           stmt=conn.createStatement();
           // Executing  the sql query
           String sql="INSERT INTO CATS"+"(name,bread,age)"+"Values('Tommy','persisn',10)";
           stmt.execute(sql);
           System.out.println("Insert Complete");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(stmt !=null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertDataInDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(InsertDataInDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
