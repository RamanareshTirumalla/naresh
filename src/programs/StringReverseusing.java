package programs;

import java.util.*;
public class StringReverseusing //fotloop
{
	public static void main(String[] args) 
	{
		StringReverseusing r=new StringReverseusing();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter: ");
		String s=sc.nextLine();
		System.out.println("Reverse of a String is :"+r.reversestr(s));     //called method
	}
	static String reversestr(String sl)                               //reverse String method
	{
		String r1="";
		for(int i=sl.length();i>0;--i)                  //execute until condition i>0 becomes false
		{
			r1=r1+(sl.charAt(i-1));
		}
		return r1;
	}
}
