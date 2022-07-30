package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9_Flipkart {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		//driver.findElement(By.xpath("(//input[contains(@class,'VJZDxU')][1])")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9597536717");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("(//input[contains(@class,'_3mctLh')])")).sendKeys("sivaji1");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'_2HKlqd')])[1]")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
