package programs;

interface boy
{
	String a="class ";
	char b='t';
	public void rose();
}
interface boys
{
	public void rose();
}
class less implements boy,boys
{
	public void rose()
	{
		
		System.out.println("executing the "+a+"\t"+b);
	}
}
public class Multipleinterface 
{
	public static void main(String[] args) 
	{
       less ff=new less();
       ff.rose();
       System.out.println(boy.a+"\t"+boy.b);
	}

}
