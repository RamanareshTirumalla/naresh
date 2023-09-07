package programs;

public class WhiteSpaceIQ {

	public static void main(String[] args) 
	{
		String str="Sp Global Solution";
		
		str =str.replaceAll("\\s+","");
		
		System.out.println("removing White spaces:"+str);

	}

}
