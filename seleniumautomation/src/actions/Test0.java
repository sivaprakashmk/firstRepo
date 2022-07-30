package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement mans = driver.findElement(By.xpath("//a[text()='Men']"));
		
		 Actions a = new Actions(driver);
		 a.moveToElement(mans).perform();
		 
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Casual Shirts']")).click();
		 
		 driver.close();
	}

}
