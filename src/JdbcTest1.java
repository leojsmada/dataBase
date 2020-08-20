//  Establish a connection to an Interbase database using JDBC and ODBC.
import java.sql.*;

class JdbcTest1
{
    public static void main(String[] args)
    {
        try
        {
            //String url = "127.0.0.1";


            String url = "jdbc:mysql://localhost:3306/mysql";

            Connection conn = DriverManager.getConnection(url, "root", "bupesap2");
            Statement st = conn.createStatement();
//-------//THIS STATEMENT BELOW IS THROWING A " Field 'idstudents' doesn't have a default value" ERROR//---------------//
          st.executeUpdate("INSERT INTO students.students (name, age, address, belt) VALUES " +
                     "('John Smith', 17, '560 Smith Lane', 'blue')");

            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}