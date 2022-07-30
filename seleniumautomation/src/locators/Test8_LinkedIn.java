package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8_LinkedIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/checkpoint/rm/sign-in-another-account?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("manager");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
