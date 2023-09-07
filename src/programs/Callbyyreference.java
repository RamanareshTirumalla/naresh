package programs;

class you
{
	int aa=40;
	void show(you abc)
	{
		abc.aa++;
	}
}
public class Callbyyreference {

	public static void main(String[] args)
	{
		you tt=new you();
		System.out.println("before value is "+tt.aa);
        tt.show(tt);
        System.out.println("update value is "+tt.aa);
	}

}
