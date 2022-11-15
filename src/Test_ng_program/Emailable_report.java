package Test_ng_program;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_report {
@Test
public void tc1() {
	Reporter.log("running tc1",true);
}
@Test
public void tc2() {
	Reporter.log("running tc2",true);
}
@Test
public void tc3() {
	Reporter.log("Running tc3",true);
	Assert.fail();//it is used to fail test case intentionally
}
}
