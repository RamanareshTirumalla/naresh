package programs;

public class Exection2 {

	public static void main(String[] args) 
	{
	
		int aaa[]= {34,66,99};
		try
		{
			System.out.println(aaa[11]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("provide the proper index for arrays");
			
		}

	}

}
