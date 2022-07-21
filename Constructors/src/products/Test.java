package products;

public class Test
{
	public static void main(String[] args)
	{
		Products p1 = new Products("Bigboy Hoover", "BH0012", 35.99);
		Products p2 = new Products("Millenial Shortcut Finder", "MS1028", 2.99);
		Products p3 = new Products("Sammy Snake Bouncy Castle", "SS0103", 102.49);
		
		System.out.println(p1.name);
		System.out.println(p2.id);
		System.out.println(p3.price);
	}
}
