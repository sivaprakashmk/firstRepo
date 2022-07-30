package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		
		String p1=driver.getWindowHandle();
		System.out.println(p1);
		
		Set<String> pc1=driver.getWindowHandles();
		System.out.println(pc1);
		
		driver.quit();
		
	}

}
