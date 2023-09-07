package programs;
interface pro
{
	  public void show();
	}
interface said
{
     public void demo();
}
class six implements pro,said
{
	public void show()
	{
		int a=90;
		a++;
		System.out.println(" executing the methode show"+a);
	}
	public void demo()
	{
		double b=8.00;
		b++;
		System.out.println("executing the method demo"+b);
	}
	
}
public class Interfaceparticemam {

	public static void main(String[] args) 
	{
		six uu=new six();
		uu.demo();
		uu.show();// TODO Auto-generated method stub

	}

}
