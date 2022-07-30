package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQjwm6KUBhC3ARIsACIwxBgHxw6k4AyFfoud28TMLKR99_hnhRW6imkhmRZ-FJJcbhuZj8AadwgaApRUEALw_wcB");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement uname=driver.findElement(By.xpath("//input[contains(@class,'desktop-searchBar')]"));
		
		if(uname.isDisplayed()) {
			System.out.println("pass: element is displayed");
			uname.sendKeys("admin");
		}
		else {
			System.out.println("fail: element is not displayed");
		}	
		driver.close();
	}

}
