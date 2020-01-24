package myTestngPackage;

import org.testng.annotations.Test;

public class Prioritydemo {
	@Test
	public void startapp()
	{
		System.out.println("Start application");
	}
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login to application");
	}
	@Test(priority=2)
	public void logout()
	{
		System.out.println("Logout from application");
	}



}
