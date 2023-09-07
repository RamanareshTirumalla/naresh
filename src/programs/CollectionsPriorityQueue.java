package programs;

import java.util.PriorityQueue;   //import java.util.*;
public class CollectionsPriorityQueue 
{
	public static void main(String[] args) 
	{
		PriorityQueue h=new PriorityQueue();
		h.add("pass");
		h.add("true");
		h.add("ttt");
		System.out.println(h);
		h.remove();
		System.out.println(h);
	}

}
