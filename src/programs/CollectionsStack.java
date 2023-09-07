package programs;
import java.util.Stack;
public class CollectionsStack 
{
	public static void main(String args[])
	{
		Stack k=new Stack();
		k.push("35");
		k.push("90");
		k.push("49");
		k.push("49");
		k.push("80");
		System.out.println(k);
		k.pop();
		System.out.println(k);
		System.out.println(k.get(2));
		
		
		
	}

}
