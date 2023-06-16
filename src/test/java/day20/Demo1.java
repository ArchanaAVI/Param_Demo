package day20;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Demo1 	{
	@Parameters({"City"})
	@Test
	public void testA(String City){
		
		Reporter.log("TestA...."+ 	City ,true);
	}
	

	 
		

	
}
