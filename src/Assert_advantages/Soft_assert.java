package Assert_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
@Test
public void TC1() {
	Reporter.log("running TC1",true);
	String expR="Hi";
	String actR="Bye";
	//object of softassert
	SoftAssert s=new SoftAssert();
	s.assertEquals(expR, actR);//verification1
	System.out.println("iam after failed verifiaction 1");//verification2
	//mandatory
	s.assertAll();
}
@Test
public void TC2() {
	Reporter.log("Hi hello");
}
}
