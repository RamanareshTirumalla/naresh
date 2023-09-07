package programs;

class bal implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			
				System.out.println(Thread.currentThread());
			}
		}
	}

public class Mult5 {

	public static void main(String[] args) 
	{
		bal nn=new bal();
		Thread tt=new Thread(nn);
		tt.start();
		bal nn1=new bal();
		Thread tt1=new Thread(nn1);
		tt1.start();

	}

}
