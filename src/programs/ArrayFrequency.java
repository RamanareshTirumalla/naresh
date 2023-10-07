package programs;

public class ArrayFrequency 
{
	public static void main(String[] args) 
	{
		int a[]= {10,50,80,80,70,80,10,50};
		int l=a.length;
		int f[]=new int [a.length];
		for(int i=0;i<=l-1;i++)
		{
			int count=1;
			int read=-1;
			for(int j=i+1;j<=l-1;j++)//sorry
			{
				if(a[i]==a[j])
				{
					count++;
					f[j]=-1;
				}
			}
			if(f[i]!=-1) 
			{
				f[i]=count;
			}
		}
		for(int k=0;k<l-1;k++)
		{
			if(f[k]>=1) 
			{
				System.out.println(a[k]+"="+f[k]);
			}
		  }
	   }	
	}
