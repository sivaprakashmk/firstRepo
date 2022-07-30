package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_3c01r1321r_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486380734074&hvpos=&hvnetw=g&hvrand=14864161643637896545&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061921&hvtargid=kwd-32679660&hydadcr=14454_2154375&gclid=CjwKCAjw4ayUBhA4EiwATWyBrmhUXt6nBdmv93zGVO1EBEi6Qwg_34NscEW2z2uSjfC2vBGPPkfkmBoCQ3AQAvD_BwE");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));		
		
		Actions a=new Actions(driver);	
		a.contextClick(search).perform();
				
				//driver.close();
	}

}
