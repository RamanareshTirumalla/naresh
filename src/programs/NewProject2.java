package programs;

import java.lang.*;
import java.util.*;
 class oone{

public  void demo() {		
System.out.println("Welcome to Mytel :");
System.out.println("Enter option 1 for mobile recharge");
System.out.println("Enter option 2 for pay bill");
System.out.println("Enter option 3 to convert prepaid to postpaid/ postpaid to preapaid");
System.out.println("Enter option 4 to know the balance");
System.out.println("Enter option 5 for profile details ");
System.out.println("Enter option 0 to exit ");
}
public void demo1()
{
String a="4";String a4="5"; int a5=0;
String a1="1"; String a2="2";String a3="3";     
Scanner abc=new Scanner(System.in);
String aa=abc.nextLine(); 
int aa1=abc.nextInt();
if(aa.equals(a1))
{
System.out.println(" Enter option 1 for mobile recharge");

}
else if(aa.equals(a2))
{
System.out.println("Enter option 2 for pay bill ");

}
else if(aa.equals(a3))
{
System.out.println("Enter option 3 to convert prepaid to postpaid/ postpaid to preapaid ");
 
}
else if(aa.equals(a))
{
System.out.println(" Enter option 4 to know the balance"); 
}
else if(aa.equals(a4))
{
System.out.println("Enter option 5 for profile details ");
} 
else if(aa1==0)
{
 one r=new one();
 r.exit();
 
}
else
{
System.out.println("Enter option invaild");
} 
}

 public void show() {
System.out.println("enter your mobile number");
Scanner abc1=new Scanner(System.in);
int  bb=abc1.nextInt();
System.out.println("Balance :46/-");
System.out.println("SMS :30");
System.out.println("Data :1GB");
System.out.println("TalkTime : Unlimited");
 }
}
class hellos extends oone
{
public void demo2() 
{
super.demo();
super.demo1();
super.show();
String b="0";String d="9";
System.out.println("Enter option 0 to exit ");
System.out.println("Enter option 9 to main menu ");
Scanner bbb=new Scanner(System.in);
String cc=bbb.nextLine();

if(cc.equals(b))
{
  System.out.println("Enter option 0 to exit ");
  
}
else if(cc.equals(d))
{
 super.demo();
int r=bbb.nextInt();
super.show();

}
}
}
public class NewProject2
{
public static void main(String arg[])
{
hellos rr=new hellos();
rr.demo2();
}
}


