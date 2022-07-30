package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		WebElement course = driver.findElement(By.id("course"));
		
		Thread.sleep(3000);
		Actions a =new Actions(driver);
		a.moveToElement(course).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		
		Thread.sleep(3000);
		WebElement add = driver.findElement(By.xpath("//i[contains(@class,'fa fa-plus')]"));
		a.doubleClick(add).perform();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
