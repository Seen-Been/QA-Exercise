package workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{

	public static void main(String[] args)
	{
		Person p1 = new Person("Sean", 25, "Bank robber");
		Person p2 = new Person("Upasana", 35, "Trainer");
		Person p3 = new Person("Kev", 40, "Chief Executive Officer");
		Person p4 = new Person("Sarah", 19, "Student");
		Person p5 = new Person("Mary", 40, "HR Manager");
		Person p6 = new Person("Sarah", 24, "Recruiter");
		
		ArrayList<Person> pList = new ArrayList<Person>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		pList.add(p5);
		pList.add(p6);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a name to search");
		String inName = scn.next();
		scn.close();

		List<String> people = pList.stream()
				.filter(p -> p.name.equalsIgnoreCase(inName)) //slower and ignores case sensitivity (just use equals)
				.map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println(people);

	}

}
