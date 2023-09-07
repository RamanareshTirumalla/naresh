package programs;

import java.util.*;
public class StringAnagram {

	public static void main(String[] args) 
	{
		String s="Brag";
		String s1="Grab";
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		if(s.length()!=s1.length())
		{
			System.out.println("Both the String are not angram");
		}
		else
		{
			char[]str1=s.toCharArray();
			char[]str2=s1.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			if(Arrays.equals(str1,str2 )==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not a Annagram");
			}
		}

	}

}
