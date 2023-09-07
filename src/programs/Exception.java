package programs;

public class Exception {

	public static void main(String[] args) 
	{
		int t=20;
		int a;
		try
		{
			a=t/0;
			System.out.println(a);
		}
		catch(ArithmeticException r )
		{
			System.out.println("pls the provide proper values for division");
		}

	}

}
