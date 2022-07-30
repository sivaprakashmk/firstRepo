package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6_SkillRary {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("sivaprakashm13@gmail.com");
		//Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Sivajimails");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title =driver.getTitle();
		String ctUrl=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println("ctUrl :"+ctUrl);
	    //url --https://www.skillrary.com/user/login
		//Thread.sleep(3000);
		driver.close();			
	}
}
