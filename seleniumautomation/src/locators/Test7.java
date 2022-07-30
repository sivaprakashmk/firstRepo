package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//driver.findElement(By.name("password")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//div[contains(@class,'Igw0E')])[2]")).click();
		String title =driver.getTitle();
		String ctUrl=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println("ctUrl :"+ctUrl);
		
		
		
		Thread.sleep(6000);
		driver.close();
	}

}
