package programs;

public class Arrayevennumber {

	public static void main(String[] args) 
	{
		int a[]= {1,2,5,6,3,2,8,12,10,13,17};
		System.out.println("odd number");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("even numbers:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
