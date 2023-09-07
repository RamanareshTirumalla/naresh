package programs;

class four
{
	int a;int b;int c;
	public four(int a1,int b1)
	{
		a=a1;b=b1;
		System.out.println(a+""+b);
	}
	public four(int a2,int b2,int c2)
	{
		a=a2;b=b2;c=c2;
		System.out.println(a+""+b+""+c);
	}
}
public class overloadingconstructor {
	public static void main(String args[])
	{
		four tt=new four(30,67);
	}

}
