package programs;

class oon implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}	
}
public class Multithearedrun
{
	public static void main(String[] args) 
	{
		oon xx=new oon();
		Thread tt=new Thread(xx);
		tt.start();
		oon yy=new oon();
		Thread ss=new Thread(yy);
		ss.start();
		
		
	}

}
