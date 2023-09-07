package programs;

import java.io.*;
public class IoStreams 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fi=new FileInputStream("\\C:\\package\\final2.java\\");
        int i=fi.read();
        while(i!=-1)
        {
        	System.out.print((char)i);
        	i=fi.read();
        }
        fi.close();
	}
}
