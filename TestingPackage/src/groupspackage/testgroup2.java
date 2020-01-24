package groupspackage;

import org.testng.annotations.Test;

public class testgroup2 {
	@Test(groups = { "regression" })
	  public void testMethod5() {
		  System.out.println("second regression test");
	  }
	@Test(groups = { "regression" })
	  public void testMethod6() {
		  System.out.println("third regression test");
	  }
	@Test(groups = { "regression" })
	  public void testMethod7() {
		  System.out.println("fourth regression test");
	  }
	@Test(groups = { "smoke" })
	  public void testMethod8() {
		  System.out.println("fourth regression test");
	  }

}
