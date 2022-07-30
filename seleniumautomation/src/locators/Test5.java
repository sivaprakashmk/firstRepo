package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		if(acttitle.equals("Facebook – log in or sign up")) {
			System.out.println("pass :home page is displayed");
		}
		else
			System.out.println("fail :home page is not displayed");
			
		String currntUrl = driver.getCurrentUrl();
		System.out.println(currntUrl);
		
		driver.close();
		
	}

}
