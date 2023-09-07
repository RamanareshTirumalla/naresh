package programs;

import java.util.*;
public class QueInetCollectionsclassReverseOrder 
{
	public static void main(String[] args) 
	{
		List<String> aa=new ArrayList<>();
		aa.add("aaa");
		aa.add("bbb");
		aa.add("ccc");
		System.out.println(aa);
		Collections.sort(aa,Collections.reverseOrder());
		System.out.println(aa);
		
	}

}
