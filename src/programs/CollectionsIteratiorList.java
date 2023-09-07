package programs;

import java.util.*;
public class CollectionsIteratiorList
{
	public static void main(String[] args) 
	{
		ArrayList<String> aa=new ArrayList<String>();
		aa.add("one");
		aa.add("two");
		aa.add("three");
		aa.add("four");
		aa.add("five");
		System.out.println(aa);
		ListIterator<String>iterator =aa.listIterator();
		System.out.println("forward Direction Iteration:");
		while(iterator.hasNext())
		{
			String bb=iterator.next();
			System.out.println(bb);
		}
		System.out.println("Backword Direction Iteration:");
		while(iterator.hasPrevious())
		{
			String i=iterator.previous();
			System.out.println(i);
		}
	}

}
