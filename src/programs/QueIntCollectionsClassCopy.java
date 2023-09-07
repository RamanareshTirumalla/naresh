package programs;
import java.util.*;
public class QueIntCollectionsClassCopy 
{
	public static void main(String[] args) 
	{
		List<String> dd=new ArrayList<>();
		dd.add("sai");
		dd.add("car");
		dd.add("king");
		dd.add("tiger");
		System.out.println(dd);
		System.out.println("The original Destination List is ");
		for(String aa:dd)
		{
		System.out.println(aa);	
		}
			List<String>ss=new ArrayList<>();
			ss.add("fast");
			ss.add("van");
			Collections.copy(dd, ss);
            System.out.println("the Destination List after Copying is");
            for(String bb:ss)
            {
            	System.out.println(bb);
        }
	}
}
