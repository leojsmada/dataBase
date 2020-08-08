//  Establish a connection to an Interbase database using JDBC and ODBC.
import java.sql.*;

class JdbcTest1
{
    public static void main(String[] args)
    {
        try
        {
            String url = "jdbc:mysql://localhost/";
            Connection conn = DriverManager.getConnection(url, "root", "bupesap2");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO students (name, age, address, belt) VALUES " +
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