package programs;

interface ones
{
	abstract public void show();
	}
class two implements ones
{
	public void show()
	{
		System.out.println(" executing the methode show");
	}
	
}
public class Interfaceone {

	public static void main(String[] args)
	{
		two rr=new two();
		rr.show();
		// TODO Auto-generated method stub

	}

}
