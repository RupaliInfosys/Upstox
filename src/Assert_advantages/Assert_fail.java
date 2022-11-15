package Assert_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
	@Test
	public void TC1() {
		Reporter.log("TC1 is running",true);
		
	}
	@Test
	public void TC2() {
		Reporter.log("TC2 is running",true);
		Assert.fail();
	}
}
