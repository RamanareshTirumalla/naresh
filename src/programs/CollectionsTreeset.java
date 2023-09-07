package programs;

import java.util.*;
public class CollectionsTreeset
{
	public static void main(String[] args) 
	{
	  Set aa=new TreeSet();
	  aa.add("one");
	  aa.add("two");
	  aa.add("three");
	  System.out.println(aa);
	  aa.remove("three");
	  System.out.println(aa);

	}

}
