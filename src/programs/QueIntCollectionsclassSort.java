package programs;

import java.util.*;
public class QueIntCollectionsclassSort            //ascending order
{
	public static void main(String[] args) 
	{
		ArrayList<String> aa=new ArrayList<String>();
		aa.add("balu");
		aa.add("sai");
		aa.add("pop");
		Collections.sort(aa);
		Iterator rr=aa.iterator();
		while(rr.hasNext())
		{
			System.out.println(rr.next());
		}

	}

}
