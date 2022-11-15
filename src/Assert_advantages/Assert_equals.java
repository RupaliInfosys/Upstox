package Assert_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals {
@Test
public void TC1() {
	Reporter.log("TC1 is running",true);
	String expR="Rupali";
	String actR="Rupali";
	Assert.assertEquals(expR,actR);
}
}
