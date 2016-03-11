package code.Shree.SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxactiTimeLoginPage {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath(".//*[@id='loginButton']/div")).click();
	    driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
	    driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[2]/td/div[3]/a")).click();
	    driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[2]/td/div[3]/a")).click();
	    driver.findElement(By.xpath(".//*[@id='ext-comp-1002']/span")).click();
	    driver.findElement(By.xpath(".//*[@id='customerLightBox_nameField']")).sendKeys("code");
	    driver.findElement(By.xpath(".//*[@id='customerLightBox_commitBtn']/div/span")).click();
	    
	}

}
