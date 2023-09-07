package programs;

import java.util.*;
public class NewProjectIt 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Mytel");
		System.out.println("Enter option 1 for mobile recharge");
		System.out.println("Enter option 2 for pay bills");
		System.out.println("Enter option 3 to convert prepaid to postpaid/postpaid to prepaid");
		System.out.println("Enter option 4 to know the balance");
		System.out.println("Enter option 5 for profile details");
		System.out.println("Enter option 0 to exit");
		
		String a="4";
		Scanner abc=new Scanner(System.in);
		String aa=abc.nextLine();
		if(aa.equals(a));
		{
			System.out.println("Enter option 4 to know the balance");	
		}
		System.out.println("Enter Mobile number");
		Scanner cc=new Scanner(System.in);
		String dd=cc.nextLine();
		System.out.println("Balance :99/-");
		System.out.println("SMS :39");
		System.out.println("Talktime :Unlimited");
		System.out.println("data :1.5 GB");
	
		String b="0";String d="9";
		System.out.println("Enter option 0 to exit");
		System.out.println("Enter option 9 to main menu");
		Scanner ff=new Scanner(System.in);
		String gg=ff.nextLine();
		if(gg.equals(b))
		{
			System.out.println("Enter option 0 to exit");
		}
		if(gg.equals(d))
		{
			System.out.println("Welcome to Mytel");
			System.out.println("Enter option 1 for mobile recharge");
			System.out.println("Enter option 2 for pay bills");
			System.out.println("Enter option 3 to convert prepaid to postpaid/postpaid to prepaid");
			System.out.println("Enter option 4 to know the balance");
			System.out.println("Enter option 5 for profile details");
			System.out.println("Enter option 0 to exit");
		}	
	}
}
