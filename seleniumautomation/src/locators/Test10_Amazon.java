package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/stores/page/0D9B4BA4-B78D-4268-9A82-D246962CDE6E/?_encoding=UTF8&store_ref=SB_A0291290QG0JCH5V087J&pd_rd_plhdr=t&aaxitk=8b22dd85742c8655e1ffeefc25e5edf0&hsa_cr_id=8155931440402&lp_asins=B09V8B38GJ%2CB09V8C5JSH%2CB09V89W8X7&lp_query=amazon%20electronic&lp_slot=auto-sparkle-hsa-tetris&ref_=sbx_be_s_sparkle_mcd_bkgd&pd_rd_w=gKWfv&pf_rd_p=47ac07ef-304a-41df-a673-0b368707e6c6&pd_rd_wg=nnLKQ&pf_rd_r=XJ844V33MT4D146YC4RG&pd_rd_r=15b68593-2ca2-42d3-ad16-370a208541e4");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//span[contains(@class,'nav-line-2')])[3]")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("admin");
		
		//driver.findElement(By.id("continue")).click();
		//driver.findElement(By.xpath("//input[contains(@class,'a-button-input')]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	driver.close();
	}

}
