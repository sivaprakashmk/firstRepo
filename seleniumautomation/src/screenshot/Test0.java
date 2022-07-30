package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1. typcasting
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//2.Access the method and store it in RAM
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//3.specify the location
		File dest=new File("./photo/facebook.png");
		
		//4.copy paste from RAM to specify location
		FileUtils.copyFile(src, dest);
		
		driver.close();
	}

}
