package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement user =driver.findElement(By.cssSelector("input[type=text]"));
		wait.until(ExpectedConditions.visibilityOf(user)).sendKeys("admin");
		
		//driver.findElement(By.cssSelector("input[type=text]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.close();
	}

}
