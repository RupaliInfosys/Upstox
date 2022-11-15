package Assert_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_not_equals {
	@Test
	public void TC2() {
		Reporter.log("TC2 is running",true);
		String expR="Rupali";
		String actR="Puja";
		Assert.assertNotEquals(expR,actR);
	}
}
