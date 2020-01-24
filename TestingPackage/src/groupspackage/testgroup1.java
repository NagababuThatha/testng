package groupspackage;

import org.testng.annotations.Test;

public class testgroup1 {
	
		  @Test(groups = { "smoke" })
		  public void testMethod1() {
			  System.out.println("first smoke test");
		  }
		  @Test(groups = { "smoke" })
		  public void testMethod2() {
			  System.out.println("second smoke test");
		  }
		  @Test(groups = { "smoke" })
		  public void testMethod3() {
			  System.out.println("third smoke test");
		  }
		  @Test(groups = { "regression" })
		  public void testMethod4() {
			  System.out.println("first regression test");
		  }


}
