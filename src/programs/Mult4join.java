package programs;

class son extends Thread
{
public void run()
{
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException r) {
	}
}
}	
}
public class Mult4join 
{
	public static void main(String[] args) 
	{
		son tt=new son();
		tt.start();
		try
		{
			tt.join();
		}
		catch(InterruptedException oo)
		{
	      }
		son kk=new son();
		kk.start();

	}
}

