package programs;

public class Arrayalargestnumber {

	public static void main(String[] args) 
	{
		int ar[]= {10,9,30,7,40,50,70};
		int s=ar.length;
		for(int i=0;i<s;i++)
		{
			int max=ar[s-1];
			if(max<ar[i])
			{
				max=ar[i];
				ar[s-1]=max;
			}
		}
		System.out.println(ar[s-1]);
	}

}
