package listners;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.crm.listeners.DwsListners.class)
public class Test1 {
	
@Test
public void  main1() {
	String expected_result="java";
	String actual_result="bava";
	assertEquals(expected_result, actual_result);
	
}
@Test

public void  main2() {
	String expected_result="java";
	String actual_result="java";
	assertEquals(expected_result, actual_result);
	
}
}
