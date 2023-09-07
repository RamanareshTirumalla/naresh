package programs;
import java.util.*;
public class CollectionsHashset
{
	public static void main(String[] args)
	{
		Set rr=new HashSet();
		rr.add("balu");
		rr.add("ram");
		rr.add("car");
		rr.add("ram");
		System.out.println(rr);
		rr.remove("ram");
		System.out.println(rr);
	}

}
