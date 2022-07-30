package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		
		//driver.findElement(By.xpath("(//div[contains(@class,'DayPicker-Day')])[40]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@aria-disabled,'false')])[7]")).click();
	}

}
