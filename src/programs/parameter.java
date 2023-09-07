package programs;
class hai
{
	int a; double b;char c;String s;float f;boolean n;
	public hai(int a1,double b1,char c1,String s1,float f1,boolean n1)
	{
		a=a1;b=b1;c=c1;s=s1;f=f1;n=n1;
		
	}
	public void show()
	{
		a++;
		b++;
		 System.out.println("value"+a+""+b+""+c+""+s+""+f+""+n);
	}
}
public class parameter {
	public static void main(String args[])
	{
		hai yy=new hai(30,3.90,'h',"naresh",23.7f,true);
		yy.show();
	}

}
