package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/qa-sample";
		String username = "root";
		String password = "root";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection was successful");
			String query = "update student set id = 22 where address = 'Italy'"; // Java statement
			Statement stmt = con.createStatement(); // SQL STatement
			stmt.executeUpdate(query);
			System.out.println("One record updated");
		} catch (SQLException e) {
			System.out.println("There was an issue with connecting to the database:" + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Connection closed");
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
