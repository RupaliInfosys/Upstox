package Assert_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_true {
@Test
public void TC3() {
	Reporter.log("Running TC3",true);
	boolean actR=false;
	Assert.assertTrue(actR);//Tc is pass
}
}
