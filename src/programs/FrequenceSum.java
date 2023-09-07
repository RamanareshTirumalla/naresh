package programs;

public class FrequenceSum 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int a []={10,20,10,30,20,10,30,40,40,50};
		int l=a.length;
		int f[]=new int[a.length];
		for(int i=0;i<=1;i++)
		{
			int count=1;
			int read=-1;
			for(int j=i+1;j<=i-1;j++)
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
		for(int k=0;k<=l-1;k++)
		{
			if(f[k]>=2)
			{
				sum=sum+a[k];
			}
		}
		System.out.println(sum);
	}
}
