package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driverSelenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("33344");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		
	
		
		
		
		
		Thread.sleep(4000);
		//1.its not related to webpage,separate focus
		//2.we can't find the address
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().sendKeys("sadsdf");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
	}

}
