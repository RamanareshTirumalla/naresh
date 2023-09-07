package programs;

class sos implements Runnable
{
public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try {
				System.out.println(Thread.currentThread());
				Thread.sleep(3000);
			}
			catch(InterruptedException r) {
				System.out.println();
		}
	}
	}
}
public class Multip6 {

	public static void main(String[] args)
	{	
		sos cc=new sos();
		Thread t=new Thread();
		t.start();
	    t.setPriority(1);
	    System.out.println(t);
	    sos c=new sos();
	    Thread t1=new Thread(c);
	    t1.start();
	    t1.setPriority(3);   
		
	}

}
