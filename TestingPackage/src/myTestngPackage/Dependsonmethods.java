package myTestngPackage;

import org.testng.annotations.Test;

public class Dependsonmethods {
	@Test
	public void startapp()
	{
		System.out.println("Start application");
	}
	@Test(dependsOnMethods="startapp")
	public void login()
	{
		System.out.println("Login to application");
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		System.out.println("Logout from application");
	}

}
