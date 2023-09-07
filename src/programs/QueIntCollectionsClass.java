package programs;

import java.util.*;
public class QueIntCollectionsClass
{
	public static void main(String[] args) 
	{
		List<String>list=new ArrayList<String>();
		list.add("a");
        list.add("java");
        list.add("Advance java");
        System.out.println("initial collection value:"+list);
        Collections.addAll(list,"sss","jjj");
        System.out.println("After adding element collection value:"+list);
        String[]strArr= {"sql","html"};
        Collections.addAll(list,strArr);
        System.out.println("After adding array value:"+list);
		

	}

}
