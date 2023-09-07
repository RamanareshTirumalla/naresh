package ram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Classes2 
{
	@Test(invocationCount = 3)
	public void ss() {
		Reporter.log("one two three",true);
	}//Sysout.out.println("boss this good");

}
