package enum_org;

public class EnumTest
{
	public enum Season{WINTER, SPRING, SUMMER, AUTUMN}; //String type
	public enum ProdColour{RED, BLUE, GREEN, YELLOW, ORANGE, BLACK, PURPLE}; //whatever is written is fixed
	public String name;
	
	public static void main(String[] args)
	{
		for(Season s : Season.values())
		{
			System.out.println(s);
		}
		
		for (ProdColour p : ProdColour.values())
		{
			System.out.println(p);
		}
	System.out.println("The index of winter is "+Season.valueOf("WINTER").ordinal());
	System.out.println("The index of winter is "+Season.valueOf("SUMMER").ordinal());
	}
}
