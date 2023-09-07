package programs;

public class Exception3Nullpointer {

	public static void main(String[] args)
	{
		String aa="naresh";
		String bb="ram";
		try
		{
		aa=null;
		System.out.println(aa.equals(bb));
			}
		catch(NullPointerException k)
		{
			System.out.println("enter value correct name");
		}
	}

}
