package testAlign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jbolanos\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("berrics");
		driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.FPdoLc.VlcLAe > center > input[type=\"submit\"]:nth-child(1)")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
		
		
		
		
	}

}
	