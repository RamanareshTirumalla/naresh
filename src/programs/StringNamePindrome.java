
package programs;

public class StringNamePindrome 
{
	public static void main(String[] args) 
	{
		String s="radar";
		StringBuffer a=new StringBuffer(s);
		a.reverse();
		String rev=a.toString();
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}
