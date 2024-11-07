

// program for JDBC connectivity, get record from database table & display on console window. 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class  JDBC_example_2
{
   public static void main(String[] args) {
       System.out.println("--------------Made by MUSKAN-------------\n\n");
       System.out.println("empno ,     Name           ,  empid, department ,address");
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/gaurav","root","");
          Statement s = c.createStatement();
          ResultSet rs = s.executeQuery("select * from tblEmp");
          while(rs.next())
          {
              System.out.printf("\n %04d , %-18s , %06d , %s     , %s",rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
          }
      }catch(Exception ex) {}
       System.out.println("\n");
   }
}
