package programs;

public class Arrayasmallnumber 
{
	public static void main(String args[])
	{
		int ar[]={10,9,30,7,40,50,70};
		int l=ar.length;
		int min=ar[0];
		for(int i=0;i<l;i++)
		{
			if(min<ar[i])
			{
				min=ar[i];
				ar[0]=min;
			}
		}
		System.out.println(ar[0]);
		
	}
	//boss this good one

}
