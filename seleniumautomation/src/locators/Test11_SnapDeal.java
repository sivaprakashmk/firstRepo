package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11_SnapDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		
		//driver.findElement(By.xpath("//div[contains(@class,'accountInner')]")).click();
		
		//driver.findElement(By.xpath("//a[text='login']")).click();
		
		//driver.findElement(By.linkText("https://www.snapdeal.com/login")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a")).click();
		
		//driver.close();
	}
}
