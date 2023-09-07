package programs;

public class Wrapperclassconvectvarible 
{
	public static void main(String[] args)
	{
		String ss="90";
		int a=Integer.parseInt(ss); a++;
		double d=Double.parseDouble(ss);d++;
		float f=Float.parseFloat(ss); f--;
		long l=Long.parseLong(ss); l++;
		byte b=Byte.parseByte(ss); b--;
		short s=Short.parseShort(ss);
		System.out.println(a+"\t"+d+"\t"+f+"\t"+l+"\t"+b+"\t"+s);
		
	}

}
