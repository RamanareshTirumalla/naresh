package programs;

import java.io.*;

public class IoStreamOutput 
{
	public static void main(String[] args) throws IOException  
	{
		int aa=66610855;
		FileOutputStream file=new FileOutputStream("\\C:\\package\\final2.java\\");
		DataOutputStream data=new DataOutputStream(file);
		data.write(aa);
		data.flush();
		data.close();
		file.close();
		
	}

}
