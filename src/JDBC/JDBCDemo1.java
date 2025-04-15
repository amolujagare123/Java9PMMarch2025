package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection
        String user = "root";
        String pass = "root";
        String connectionUrl = "jdbc:mysql://localhost:3306/school";

        Connection con = DriverManager.getConnection(connectionUrl, user, pass);

        // 3. create a statement
        Statement st = con.createStatement();

        // 4. execute query // DML - insert ,Home work -  update , delete
        String sql = "INSERT INTO student VALUES (11, 'Amol', 'Civil', 80)";

        /*int value = */  st.executeUpdate(sql);

        /*System.out.println(value);*/
    }
}
