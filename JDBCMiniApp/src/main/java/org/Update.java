package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	String url = "jdbc:mysql://localhost:3306/qa-sample";
	String username = "root";
	String password = "root";
	Connection con = null;

	public void UpdateData()
	{
		try
		{
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to database successfully!");
			Scanner scn = new Scanner(System.in);
			Statement stmt = con.createStatement(); // SQL Statement
			ResultSet rs = stmt.executeQuery("select id, name, address, phone from student");
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Which column would you like to update?");
			
			for (int i = 1; i <= rsmd.getColumnCount(); i++)
			{
				System.out.println(i + ". " + rsmd.getColumnLabel(i));
			}
			
			int input = scn.nextInt();
			
			switch (input)
			{
			case 1:
				System.out.println("You have chosen " + rsmd.getColumnLabel(1) + ". Please enter the " + rsmd.getColumnLabel(1) + " to update:");
				String idInput = scn.next();
				System.out.println("Please enter what you would like to change " + idInput + " to:");
				String newIdInput = scn.next();
				scn.close();
				String idQuery = "update student set " + rsmd.getColumnLabel(1) + " = '" + newIdInput + "' where " + rsmd.getColumnLabel(1) + " = '" + idInput + "'" ;
				stmt.executeQuery(idQuery);
				break;
			case 2:
				System.out.println("You have chosen " + rsmd.getColumnLabel(2) + ". Please enter the " + rsmd.getColumnLabel(2) + " to update:");
				String nameInput = scn.next();
				System.out.println("Please enter what you would like to change " + nameInput + " to:");
				String newNameInput = scn.next();
				scn.close();
				String nameQuery = "update student set " + rsmd.getColumnLabel(2) + " = '" + newNameInput + "' where " + rsmd.getColumnLabel(2) + " = '" + nameInput + "'" ;
				stmt.executeQuery(nameQuery);
				break;
			case 3:
				System.out.println("You have chosen " + rsmd.getColumnLabel(3) + ". Please enter the " + rsmd.getColumnLabel(3) + " to update:");
				String addInput = scn.next();
				System.out.println("Please enter what you would like to change " + addInput + " to:");
				String newAddInput = scn.next();
				scn.close();
				String addQuery = "update student set " + rsmd.getColumnLabel(3) + " = '" + newAddInput + "' where " + rsmd.getColumnLabel(3) + " = '" + addInput + "'" ;
				stmt.executeQuery(addQuery);
				break;
			case 4:
				System.out.println("You have chosen " + rsmd.getColumnLabel(4) + ". Please enter the " + rsmd.getColumnLabel(4) + " to update:");
				String phoneInput = scn.next();
				System.out.println("Please enter what you would like to change " + phoneInput + " to:");
				String newPhoneInput = scn.next();
				scn.close();
				String phoneQuery = "update student set " + rsmd.getColumnLabel(4) + " = '" + newPhoneInput + "' where " + rsmd.getColumnLabel(4) + " = '" + phoneInput + "'" ;
				stmt.executeQuery(phoneQuery);
				break;
			}
		}
		catch (SQLException e)
		{
			System.out.println("There was an issue with connecting to the database:" + e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			try
			{
				System.out.println("Connection closed");
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
