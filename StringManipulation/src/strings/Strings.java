package strings;

public class Strings
{
	public static void main(String[] args)
	{
		String str = "Hello world"; //good for unique strings
		str = str + ", how are you?"; //creates second object
		str = str + " It's nice to meet you."; //creates third object
		
		System.out.println(str);
		System.out.println(str.charAt(6));	// w is at position 6.
		System.out.println(str.indexOf("nice"));
		System.out.println(str.concat(" I am from England."));	// Concatenation
		System.out.println(str.replace("nice", "unpleasant"));	// replace values
		System.out.println(str.contains("nice"));	// boolean to check for presence of value
		System.out.println(str.substring(10, 15)); // In format (beginIndex, endIndex), returns substring. This one returns "d, ho".
		String name1 = "Tom";
		String name2 = "tom";
		System.out.println(name1.equals(name2)); // boolean version of checking equality. Is useful for comparing when "new" object operator is used
		
		if (name1 == name2) // if statement checking of equality
		{
			System.out.println("strings equal"); 
		}
		else
		{
			System.out.println("strings not equal");
		}

		StringBuilder sb = new StringBuilder(80); // can become quite resource hungry.
		sb.append("Oh "); // append is add to end
		sb.append("hello");
		sb.insert(8, ".. Yes mate 'course mate");
		System.out.println(sb);
		System.out.println(sb.reverse()); // reverse string
		sb.insert(8, ".. Yes mate 'course mate"); // adding this after the reverse will add it to the reversed string.
		System.out.println(sb);
		System.out.println(sb.capacity()); // returns capacity
		
	}
}
