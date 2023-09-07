package programs;

public class VowelConsonantIQ 
{
	public static void main(String[] args) 
	{
		int v=0,c=0;
		String s="java html testing spglobal";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='l'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
			v++;	
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				c++;
			}
		}
		System.out.println("vowels:"+v);
		System.out.println("consonants:"+c);
	}
}
