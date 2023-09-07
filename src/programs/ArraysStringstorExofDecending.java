package programs;

import java.util.Arrays;
import java.util.Collections;
public class ArraysStringstorExofDecending {

	public static void main(String[] args) 
	{
		String []a= {"you","are","good"};
		Arrays.sort(a,Collections.reverseOrder());
        System.out.println("desending order elements"+Arrays.toString(a));
	}

}
