package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_jing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Jing_(software)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement text=driver.findElement(By.id("firstHeading"));
		System.out.println(text.getText());
		
		driver.close();
	}

}
