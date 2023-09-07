package programs;

public class Rambus 
{
	public static void main(String[] args) 
	{
		int n=6;int m=5;
		for(int i=0;i<n;i++)
		{
		for(int j=n-i;j>1;j--)
		{
		System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
		for(int i=0;i<=m-1;i++)
		{
		for(int j=0;j<=i;j++)
		{
		System.out.print(" ");
		}
		for(int k=0;k<=m-1-i;k++)
		{
	    System.out.print("* ");
		}
		System.out.println();
		}
    	}
        }
