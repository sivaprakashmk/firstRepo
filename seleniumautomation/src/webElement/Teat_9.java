package webElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teat_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement serch=driver.findElement(By.xpath("//input[contains(@class,'desktop-searchBar')]"));
		serch.sendKeys("dress");
		
		 List<WebElement> options = driver.findElements(By.xpath("//li[contains(@class,'desktop-suggestion null')]"));
		 System.out.println(options.size());
		 
		 for(WebElement alloptions:options) {
			 System.out.println(alloptions.getText());
		 }
		 
		 driver.close();
	}

}
