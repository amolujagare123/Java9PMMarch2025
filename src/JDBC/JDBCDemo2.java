package JDBC;

import java.sql.*;

public class JDBCDemo2 {

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

        // 4. execute query // DDL - select
        String sql = "select * from student where marks<85";

        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }
        }



}
