package programs;

import java.util.*;
public class QueIntCollectionsClassBinarySearch 
{
	public static void main(String[] args) 
	{
		List<String> tt=new ArrayList<>();
		tt.add("cat");
		tt.add("dog");
		tt.add("gaot");
		Collections.sort(tt);
		System.out.println(tt);
		System.out.println("The element is at"+Collections.binarySearch(tt,"cat"));
		System.out.println("The element is at"+Collections.binarySearch(tt,"run"));	
	}

}
