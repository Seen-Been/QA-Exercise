package org;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		Append app = new Append();
		Read read = new Read();
		Update update = new Update();
		Delete delete = new Delete();
		System.out.println("Welcome to DB Manager");
		System.out.println("Please select an operation:");
		System.out.println("1. Append a row to the student table");
		System.out.println("2. Read from the student table");
		System.out.println("3. Update a record");
		System.out.println("4. Delete a record");
		int input = scn.nextInt();
		
		switch (input)
		{
		case 1:
			app.AppendData();
			break;
			
		case 2:
			read.ReadData();
			break;
		case 3:
			update.UpdateData();
			break;
		case 4:
			delete.DeleteData();
		}
	}
}
