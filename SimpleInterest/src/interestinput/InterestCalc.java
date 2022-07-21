package interestinput;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class InterestCalc {

	public static void main(String[] args) {
		//input name
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your first name.");
		String firstName = scanner.next();
		System.out.println("Please enter your last name.");
		String lastName = scanner.next();
		System.out.println("Welcome back " + firstName + " " + lastName + "!");
		
		//dirty way of pausing just so the messages don't send at once
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Please enter the amount borrowed(£):");
		double amount = scanner.nextDouble();
		System.out.println("Please enter the interest rate(%):");
		double rate = scanner.nextDouble();
		System.out.println("Please enter the time(years):");
		int time = scanner.nextInt();
		
		double interest = (amount*rate*time)/100;
		double finalPayment = interest+amount;
		
		scanner.close();
		
		System.out.println(firstName + lastName + ", the total sum to be repaid will be " + finalPayment + ", as the monthly interest rate will be " + interest + ".");
		


	}

}
