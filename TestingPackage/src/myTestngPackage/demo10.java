package myTestngPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo10{
	WebDriver driver;
	@BeforeMethod
	public void startapp(){
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
         }
	@Test
	public void checktitle(){
		String title=driver.getTitle();
		String expectedtitle="google";
		Assert.assertEquals(expectedtitle, title);
	}
	@Test(priority=1)
	public void checklogo(){
		boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(logo);
	}
	@AfterMethod
	public void closebrowser(){
		driver.quit();
	}
	
}