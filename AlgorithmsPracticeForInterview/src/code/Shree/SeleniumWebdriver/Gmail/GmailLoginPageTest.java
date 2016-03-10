package code.Shree.SeleniumWebdriver.Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("seleniumocme");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("justenter");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		System.out.println("Hello");
	}

}
