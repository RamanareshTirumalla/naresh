package programs;

public class StringSmallestLargestWord 
{
	public static void main(String[] args) 
	{
		String s="Kgf valuse java css c++ html testing";
		String word="",small="",large="";
		String[]words =new String[99];
		int length=0;
		s=s+" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				word=word+s.charAt(i);	
			}
			else 
			{
				words[length]=word;
				length++;
				word="";
			}
		}
		small=large=words[0];
		for(int k=0;k<length;k++)
		{
		  if(small.length()>words[k].length())
			  small=words[k];
		  if(large.length()<words[k].length())
			  large=words[k];
		}
		System.out.println("Smallest word:"+small);
		System.out.println("Largest word:"+large);

	}
}
