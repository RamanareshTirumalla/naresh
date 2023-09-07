package programs;
class one11
{
	static int a=60;
	static String aa="naresh";
	static public void show()
	{
		System.out.println("executing the show method"+a);
	}
	static public void ramu()
	{
		System.out.println("eecuting the ramu method"+aa);
	}
}
public class Blockofcode
{
	public static void main(String[] args) {
		System.out.println(one11.a);
		System.out.println(one11.aa);
		one11.show();
		one11.ramu();
	}
	
	
}
