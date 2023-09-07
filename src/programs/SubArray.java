package programs;
import java.util.*;
public class SubArray 
{
	public static void findsubarray(int[]a,int n,int u) 
	{
		int s=a[0];
		int ss=0;
		for
		(int i=1;i<=n;i++)
		{
			while(s>u&&ss<i-1)
			{
				s=s-a[ss];
				ss++;
			}
			if(s==u)
			{
				System.out.println("subarray index"+ss+"and"+(i-1));
				return;
			}
			if(i<n)
				s=s+a[i];
		}
		System.out.println("on subarray");
	}

      public static void main(String args [])
      {
    	  int []a= {15,52,22,10,10};
    	  int n=a.length;
    	  int u=10;
    	  findsubarray(a,n,u);
      }
      }
