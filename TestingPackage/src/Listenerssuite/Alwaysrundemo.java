package Listenerssuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alwaysrundemo {
	WebDriver driver;
	@Test
	public void startapp(){
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		System.out.println("Start Application");
	}
	@Test(dependsOnMethods="startapp")
	public void checktitle(){
		driver.findElement(By.id("Email")).sendKeys("nag123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nag123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String expectedname="Demowebstore";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		Assert.assertEquals(expectedname, actualname);
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("Log out of the application");
	}
	@Test(dependsOnMethods="checktitle",alwaysRun=true)
	public void logoff(){
		driver.close();
	}

}
