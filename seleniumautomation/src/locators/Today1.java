package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Today1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		//driver.findElement(By.id("username")).sendKeys("admin");
		
		WebElement user =driver.findElement(By.id("username"));
		user.sendKeys("admin");
		Thread.sleep(1000);
		user.clear();
		
		
		Thread.sleep(1000);
		//driver.findElement(By.id("password")).sendKeys("manager");
		
		WebElement pas =driver.findElement(By.id("password"));
		pas.sendKeys("manager");
		Thread.sleep(3000);
		pas.clear();
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).submit();
		driver.close();
	}

}
