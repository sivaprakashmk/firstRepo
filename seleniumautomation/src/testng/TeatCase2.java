package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeatCase2 {
	public WebDriver driver;

	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void tc2() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.id("identify_email")).sendKeys("2345678");
		driver.findElement(By.id("did_submit")).click();
		String tittle = driver.getTitle();
		Reporter.log(tittle, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url, true);
	}

	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
