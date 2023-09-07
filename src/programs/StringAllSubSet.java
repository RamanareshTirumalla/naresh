package programs;

public class StringAllSubSet
{
	public static void main(String[] args) 
	{
		String s="balu";
		int len=s.length();
		int temp=0;
		String arg[]=new String[len*(len+1)/2];
		for(int i=0;i<len;i++)
		{
		for(int j=i;j<len;j++)
		{
			arg[temp]=s.substring(i,j+1);
			temp++;
		}
	}
		System.out.println("All subset");
		for(int i=0;i<arg.length;i++)
		{
			System.out.println(arg[i]);
		}
	}
}
