package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample
{
	public static void main(String[] args)
	{
		String name = "Sean";
		Employee emp = new Employee();
		Book book1 = new Book();
		Book book3 = new Book();
		Book book14 = new Book();
		Book book29 = new Book();
		
		
		
		Customer cust = new Customer();
		ArrayList<Object> myArray = new ArrayList<Object>(); //any object
		
		myArray.add(name);
		myArray.add("Ben");
		myArray.add(emp);
		myArray.add(cust);
		myArray.add(book1);
		myArray.add(324336); //Integer x = new Integer (234567);
		myArray.add(true);
		
		ArrayList<String> myString = new ArrayList<String>(); // "<String>" generic type does not seem to be required, maybe this is for mixing types
		myString.add("Gregory");
		myString.add("Lucas");
		myString.add("Stephanie");
		myString.remove(2); //removes at position 2 (third one)
		
		ArrayList<Book> myBooks = new ArrayList<Book>(); // "<Book>" generic type does not seem to be required but is best practise?
		myBooks.add(book1);
		myBooks.add(book3);
		myBooks.add(book14);
		myBooks.add(book29);
		
		System.out.println(myBooks); //shows object equivalent.
		System.out.println(myString); //prints list
		System.out.println(myArray);
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		myList.add(10); // "alt" allows modification of multiple lines
        myList.add(1355417);
        myList.add(63);
        
        Collections.sort(myList); //sorts a list of integers
        for (int i : myList)
        {
        	System.out.println(i);
        }
	}
}
