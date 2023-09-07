package programs;

interface maa
{
	int a=22;
	int d=33;
	public void room();
}
interface zee
{
	char c='r';
	public void small();
}
class big implements maa,zee
{
	public void room()
	{
		System.out.println("executing the "+a+"\t"+d);
	}
	public void small()
	{
		System.out.println("executing the "+c);
	}
}
public class Interfacetwomethodssir 
{
	public static void main(String[] args) 
	{
		big kk=new big();
		kk.room();
		kk.small();
		System.out.println(maa.a+" \t"+maa.d);
		System.out.println(zee.c);
	}

}
