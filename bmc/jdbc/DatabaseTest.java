package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseTest {

	public static void main(String[] args) {
		String user="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/bmc";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,user,pass);
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values(7,'josel',20,87)");
			ResultSet rs=stmt.executeQuery("SELECT * FROM STUDENT");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " : " + rs.getString("name")+ " : "+ +rs.getInt("age")+ " : "+rs.getInt("mark"));
			}
		} catch (ClassNotFoundException e) {

			System.out.println("Driver class is not available");
		} catch (SQLException e) {
			
			System.out.println("some sql exception...");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
			System.out.println("some SQL Exception while closing the connection..");
			}
		}

	}

}
