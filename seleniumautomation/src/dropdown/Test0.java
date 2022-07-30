package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select s = new Select(dropdown);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("search-alias=fashion");
		Thread.sleep(3000);
		s.selectByVisibleText("Apps & Games");

		/*List<WebElement> options = s.getOptions();
		System.out.println(options.size());

		for (WebElement b : options) {
			System.out.println(b.getText());
		}*/
		driver.close();

	}

}
