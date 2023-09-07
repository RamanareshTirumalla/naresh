package programs;

class car extends Thread
{
	public void run()
	{
		for(int a=0;a<=10;a++)
		{
			System.out.println(a);
		}
	}
}
public class Multi 
{
	public static void main(String[] args) 
	{
		car rr=new car();
		rr.start();
		car ss=new car();
		ss.start();
		car yy=new car();
		yy.start();
	}
}
