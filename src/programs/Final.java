package programs;

final class block
{
	final int a=20;
	final public void show()
	{
		a=100;
		System.out.println("executing show method");
	}
}
class twos extends block
{
	public void show()
	{
		System.out.println("executing the child class");

	}
	
}
public class Final {
	public static void main(String[] args) 
	{
		twos tt=new twos ();
		tt.show();
		

	}

}
