package org;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		boolean loopBreak = false;
		
		Employee e1 = new Employee("Syrrel", "Wilberforce", 56, "United Kingdom", 7829406202L, "wilberforce@live.com", 42000);
		Employee e2 = new Employee("Alessia", "Ferrari", 27, "United Kingdom", 845927395L, "ferrari@aol.com", 38000);
		Employee e3 = new Employee("Cherry", "Terrey", 69, "United Kingdom", 77777777L, "cheztez@hotmail.co.uk", 130000);
		Employee e4 = new Employee("John", "Heystack", 30, "United Kingdom", 7902518239L, "jheystack.com", 50000);
		Employee e5 = new Employee("Sally", "O'Gregor", 61, "United Kingdom", 7829406202L, "sallys house", 51000);

		while (loopBreak == false) //Loop for operation selection and retry
		{
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Please select an operation:");
			System.out.println("1. Greeter");
			System.out.println("2. Salary calc");
			System.out.println("3. Phone number length checker");
			System.out.println("4. Email format checker");
			int input = scn.nextInt();

			
			switch (input)
			{
			case 1: //NAME GREETER
				System.out.println("You have chosen the greeter");
				//System.out.println("Please select an employee");
				//String emp = scn.next();
				System.out.println(e1.greeting(e1.firstName, e1.lastName));
				break;
			case 2: //FINAL SALARY CALC
				System.out.println("You have chosen the total salary calculator");
				//System.out.println("Please select an employee");
				System.out.println(e1.finalSalary(e1.salary));
				break;
			case 3: //PHONE # LENGTH CHECK
				System.out.println("You have chosen the phone number length");
				System.out.println("Please select an employee:");
				break;
			case 4: //EMAIL @ CHECKER
				System.out.println("You have chosen the email address format checker");
				System.out.println("Please select an employee:");
				break;
			default: //INVALID INPUT MESSAGE
				System.out.println("Option chosen is not a valid input.");
			}
			
			System.out.println("Would you like to retry?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int retry = scn.nextInt();
			
			if (retry == 1)
			{
				continue;
			}
			else
			{
				System.out.println("Exiting...");
				scn.close();
				loopBreak = true;
				break;
			}
		}

	}

}
