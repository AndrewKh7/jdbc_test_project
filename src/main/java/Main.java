import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       String name = "root";
       String password = "qwe";
       String url = "jdbc:mysql://localhost:3306/test";
       try(Connection con = DriverManager.getConnection(url,name,password)){
           System.out.println("hi!");

           // getting Statement object to execute query
           Statement stmt = con.createStatement();

           // executing SELECT query
           ResultSet rs = stmt.executeQuery("select count(*) from books;");

           while (rs.next()) {
               int count = rs.getInt(1);
               System.out.println("Total number of books in the table : " + count);
           }
       }
    }
}
