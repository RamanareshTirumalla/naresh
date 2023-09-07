package programs;

public class StringIndividalCharacters {

	public static void main(String[] args)
	{
	   String s="vennaya";
	   //Display individual character from given String
        System.out.print("Individual charactur :");
        //Iterate through the String and display individual character
        for(int i=0;i<s.length();i++)
        {
        	System.out.print(s.charAt(i)+"    ");
        }
	}

}
