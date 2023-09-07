package programs;

public class StringSwapString 
{
	public static void main(String[] args)
	{
		String s1="Sp global",s2="solution";
		System.out.println("before swapping:"+s1+" "+s2);
		//Concatenate both the string s1 and s2 and store it in s1
		s1=s1+s2;	//sp global solution
		//Extract s2 from updated s1
		s2=s1.substring(0,(s1.length()-s2.length()));
		//Extract s1 from updated s2
		s1=s1.substring(s2.length());
		System.out.println("after swapping :"+s1+" "+s2);

	}

}
