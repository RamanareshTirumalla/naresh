package programs;

public class Static1
{
	class one
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
	public class ones
	{
		public static void main(String[] args) {
			System.out.println(one.a);
			System.out.println(one.aa);
			one.show();
			one.ramu();
		}
		
		
	}
	

}
