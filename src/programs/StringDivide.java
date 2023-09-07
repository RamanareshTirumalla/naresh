package programs;

public class StringDivide {

	public static void main(String[] args) 
	{
		String s="Ramanaresh";
		int length=s.length();
		int n=5;
		int temp=0,charact=length/n;
		String[]equalStr=new String[n];
		if(length%n!=0)
		{
			System.out.println("String cannot be divided into+equal part");
		}
		else
		{
			for(int i=0;i<length;i=i+charact)
			{
				String part=s.substring(i,i+charact);
				equalStr[temp]=part;
				temp++;
			}
			System.out.println(n+"equal part of given string are");
			for(int i=0;i<equalStr.length;i++)
			{
				System.out.println(equalStr[i]);
			}
		}
	}

}
