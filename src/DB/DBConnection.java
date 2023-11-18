package DB;
import java.sql.*;

public class DBConnection{
   public  Connection con;
   public Statement stmt;
   public PreparedStatement pstmt;
   public ResultSet rst;
    
    public DBConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/attendance","root","root");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
