package programs;

import java.io.*;
class Student implements Serializable
{
int id;
String name;
Student()
{
	id=5;
	name="manoj";
}
void display()
{
	System.out.println("id is"+id);
	System.out.println("name is"+name);
}
}
public class IoStreamObjectOutput 
{
	public static void main(String[] args) throws IOException 
	{
		Student s=new Student();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\User\\Desktop\\hello.txt");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(s);
		FileInputStream fi=new FileInputStream("C:\\Users\\User\\Desktop\\hello.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Student ss=(Student)oi.readObject(IoException);
		ss.display();
		oi.close();
		fi.close();
		os.close();
		

	}

}
