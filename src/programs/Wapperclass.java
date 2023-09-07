package programs;

public class Wapperclass {

	public static void main(String[] args)  
	{
int a=23; double d=2.90; float f=2.99f; char c='r'; short s=5; long l=3456; boolean b=true; byte t=6;
		Integer aa=new Integer(a);
		Double dd=new Double(d);
		Float ff=new Float(f);
		Character cc=new Character(c);
		Short ss=new Short(s);
		Long ll=new Long(l);
		Boolean bb=new Boolean(b);
		Byte tt=new Byte(t);
		System.out.println(aa+"\t"+dd+"\t"+ff+"\t"+cc+"\t"+ss+"\t"+ll+"\t"+bb+"\t"+tt);
		int a1; double d1; float f1; char c1; short s1; long l1; boolean b1; byte t1;
		a1=aa; d1=dd; f1=ff; c1=cc; s1=ss; l1=ll; b1=bb; t1=tt;
		System.out.println(a1+"\t"+d1+"\t"+f1+"\t"+c1+"\t"+s1+"\t"+l1+"\t"+b1+"\t"+t1);
	}

}
