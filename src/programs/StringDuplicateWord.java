package programs;

public class StringDuplicateWord {

	public static void main(String[] args) 
	{
		String s="sai java css html testing java css hello sai ";
		int count;
		s=s.toLowerCase();
		String word[]=s.split(" ");
		System.out.println("Duplicate:");
		for(int i=0;i<word.length;i++)
		{
			count=1;
			for(int j=i+1;j<word.length;j++)
			{
			if(word[i].equals(word[j]))
			{
				count++;
		         word[j]="0";
			}
		}
			if(count>1&&word[i]!="0")
			System.out.println(word[i]);
		}
	}
}
