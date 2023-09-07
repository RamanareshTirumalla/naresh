package programs;
import java.util.*;
public class CollectionsHashMap
{
	public static void main(String[] args)
	{
		Map xx=new HashMap();
		xx.put("1","ram");
		xx.put("2","cat");
		xx.put("3","bad");
		String rr=(String)xx.get("2");
		System.out.println(rr);
		Integer a=new Integer(99);
		xx.put("Key",a);
		System.out.println(xx);
		

	}

}
