package programs;

interface by
{
	int c=90;
	int d=99;
	public void nar();
    public void say();
}
class man implements by
{
	public void nar()
	{
		System.out.println("eecuting the "+c);
	}
	public void say()
	{
		System.out.println("executing the "+d);
	}
}

public class Interfacesir 
{
	public static void main(String[] args)
	{
		man pp=new man();
		pp.nar();
		pp.say();
		System.out.println(by.c);
		System.out.println(by.d);
		}
}
