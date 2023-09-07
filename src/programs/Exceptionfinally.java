package programs;

public class Exceptionfinally {

	public static void main(String[] args) 
	{
		int a[]= {20,90,99};
		try
		{
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("executing the catch block");
			
		}
		finally
		{
			System.out.println("executing the finally block");
		}
	}
}
