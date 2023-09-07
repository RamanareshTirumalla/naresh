package programs;

import java.util.*;
public class CollectionsIterator 
{
	public static void main(String[] args) 
	{
		ArrayList s=new ArrayList();    //ArrayList<Integer>=new ArrayList<Integer>();
		s.add("sai");                   //s.add(1);
		s.add("car");
		s.add("men");
		s.add("dog");
		System.out.println(s);
		Iterator v=s.iterator();
		int g=0;
		while(v.hasNext())
		{
			Object a=v.next();
			if(g==3)
			{
				v.remove();
				System.out.println("removed");
			
			}
			g++;
		    }
			System.out.println(s);
		}
	}


