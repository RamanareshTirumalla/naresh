package programs;
interface on
{
	abstract public void show();
	}
interface tw
{
	abstract public void demo();
}
class three implements on,tw
{
	public void show()
	{
		System.out.println(" executing the methode show");
	}
	public void demo()
	{
		System.out.println("executing the method demo");
	}
	
}
public class Interfacetwoclasspro {

	public static void main(String[] args) 
	{
		three tt=new three();
		tt.show();
		tt.demo();
		// TODO Auto-generated method stub

	}

}
