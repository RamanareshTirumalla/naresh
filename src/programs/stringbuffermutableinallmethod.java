package programs;

public class stringbuffermutableinallmethod 
{
	public static void main(String[] args) 
	{
		StringBuffer a=new StringBuffer("sai ram");
		StringBuffer b=new StringBuffer("lakshmi");
		System.out.println(a.append(b));
		System.out.println(a);
		System.out.println(a.insert(3,"tanku"));
		System.out.println(a.reverse());
		
		
	}

}
