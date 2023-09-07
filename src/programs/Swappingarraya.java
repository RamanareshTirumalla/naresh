package programs;

public class Swappingarraya {

	public static void main(String[] args)
	{
		int a[]= {11,33,45,67,89,99,34,21};
		int l=a.length;
		int c;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(a[i]>a[j])
				{
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.println(a[l-1]);
		System.out.println(a[l-2]);
        System.out.println(a[0]+"\t"+a[1]);
	}

}
