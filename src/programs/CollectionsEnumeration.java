package programs;

import java.util.*;
public class CollectionsEnumeration extends Vector
{
	public static void main(String[] args) 
	{
		Vector a=new Vector();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		Enumeration cc=a.elements();
		int c=0;
		while(cc.hasMoreElements())
		{
			Object vv=cc.nextElement();
			System.out.println("No.is"+" "+vv);
		}	
	}
}
