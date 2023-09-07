package programs;

public class Duplicatelementarray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,2,7,8,8,3,3,4};
		int l=a.length;
		 //System.out.println(l);
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]);
				}
			}
		}

	}

}
