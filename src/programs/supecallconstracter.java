package programs;

class sai
{
	public sai()
	{
		System.out.println("execute parent class constacter");
		
	}
}
class ramu extends sai
{
	public ramu()
	{
		super();
		System.out.println("execute child class constacter");
		
	}
}
public class supecallconstracter 
{
	public static void main(String[] args) {
		ramu gg=new ramu(); 
	}

}
