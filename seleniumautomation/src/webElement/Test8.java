package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement uname=driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]"));
		//uname.click();
		
		driver.findElement(By.xpath("(//a[contains(@class,'_42ft ')])[3]")).click();
		
		WebElement button=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		if(button.isSelected()) {
			System.out.println("pass :element is selected");
		}
		else {
			System.out.println("fail :element is not selected");
		}
		driver.close();
	}

}
