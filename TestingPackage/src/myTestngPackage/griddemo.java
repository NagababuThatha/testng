package myTestngPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class griddemo {
	public WebDriver driver;
	@Test
	public void verifylogin() throws MalformedURLException{
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL("http://172.23.102.12:4455/wd/hub"),capabilities);
		driver.get("http://demowebshop.tricentis.com/login");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("Email")).sendKeys("nag123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nag123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	

}
