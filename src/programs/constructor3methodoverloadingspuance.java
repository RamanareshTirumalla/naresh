package programs;
class eat
{
	char a;
	String b;
	public eat(char m,String l)
	{
		a=m;b=l;
		System.out.println(a+""+b);
	}
	public eat(String q,char w)
	{
		b=q;a=w;
		System.out.println(b+""+a);
	}
}
public class constructor3methodoverloadingspuance
{
	public static void main(String args[])
	{
		eat oo=new eat('h',"ram");
	}

}
