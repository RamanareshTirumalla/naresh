package programs;

public class PunctuationCountString {

	public static void main(String[] args) 
	{
		int count=0;
		String s="chi\nni said,'the student! of sp :global'?.";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)==','||s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='-'||s.charAt(i)=='\"'||s.charAt(i)=='\''||s.charAt(i)==':'	)	
					{
				count++;
				
					}
		}
		System.out.println("Number of punctuaction:"+count);
	}

}
