package programs;

class Some extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {	
			}
		}
	}
}
public class MultithreadSleeping {
	public static void main(String args[]) {
		Some obj=new Some();
		obj.start();
		Some obj1=new Some();
		obj1.start();
	}
}