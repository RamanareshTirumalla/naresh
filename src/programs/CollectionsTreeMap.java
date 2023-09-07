package programs;

import java.util.*;
public class CollectionsTreeMap 
{
	public static void main(String[] args) 
	{
		Map a=new TreeMap();
		a.put("1","balu");
		a.put("2","bad");
		a.put("3","boy");
		System.out.println(a);
		String aa=(String)a.get("2");
		System.out.println(aa);
		Integer ss=new Integer(13);
		a.put("Key",ss);
		System.out.println(a);
	}

}
