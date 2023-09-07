package programs;
class five
{
	int aa;double dd;
	public five(int x)
	{
		aa=x;
		System.out.println(aa);
	}
	public five(double y)
	{
		dd=y;
		System.out.println(dd);
	}
}

public class constructor2diffdatatype 
{
	public static void main(String args[])
	{
		five rr =new five(30.90);
		
	}

}
