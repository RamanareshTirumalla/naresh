package programs;
class one
{
	int aa=50;
	public void demo()
	{
		System.out.println("excuted demo method");
	}
}
class rama extends one
{
	public void show()
	{
		System.out.println(super.aa);
		super.demo();
		System.out.println("excuted show method");
	}
	
}
public class supecallvariblesandmethods 
{
	public static void main(String[] args) 
	{
		rama ss=new rama();
		ss.show();
		
	}

}
