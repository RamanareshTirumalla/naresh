package programs;

import java.util.*; 
public class CollectionsLinkedList extends LinkedList
{
	public static void main(String[] args) 
	{
		 CollectionsLinkedList aa=new  CollectionsLinkedList();
		 aa.addFirst("chennai");
		 aa.addFirst("door");
		 System.out.println(aa);
		 aa.addLast("air");
		 aa.addLast("water");
		 System.out.println(aa);
		 String ss=(String)aa.getFirst();
		 System.out.println(ss);
		 String sg=(String)aa.getLast();
		 System.out.println(sg);
		 aa.removeFirst();
		 System.out.println(aa);
		 aa.removeLast();
		 System.out.println(aa);
		 		

	}

}
