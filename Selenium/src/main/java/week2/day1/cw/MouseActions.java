package week2.day1.cw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement closeLogin = driver.findElementByXPath("//button[text()='✕']");
		closeLogin.click();
		WebElement HomesAndFurniture = driver.findElementByXPath("//span[text()='Home & Furniture']");
		Actions builder=new Actions(driver);
		builder.moveToElement(HomesAndFurniture).perform();
		driver.findElementByLinkText("Paintings").click();	
	}
}
