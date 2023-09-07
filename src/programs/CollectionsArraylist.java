package programs;

import java.util.*;

public class CollectionsArraylist {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		ArrayList<Integer>b=new ArrayList<Integer>();
		a.add("king");
		a.add("sai");
		a.add("door");
		b.add(234);
		b.add(456);
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(b);
		b.remove(0);
		System.out.println(b);
		System.out.println(b.get(0));

	}

}
