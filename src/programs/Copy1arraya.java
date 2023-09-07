package programs;

public class Copy1arraya {

	public static void main(String[] args) 
	{
		int a1[]= {1,2,3,4,5,6,7,8,9,10};    
		int a2[]=new int[a1.length];
		
		for(int i=0;i<a1.length;i++)
		{
			a2[i]=a1[i];
		}
		System.out.println("original array");
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("new array");
	for(int i=0;i<a2.length;i++)
	{
		System.out.print(a2[i]+" ");
	}
	}
	}


