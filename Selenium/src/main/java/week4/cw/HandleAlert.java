package week4.cw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alertObject= driver.switchTo().alert();
		String name="Jayashri";
		alertObject.sendKeys(name);
		alertObject.accept();
		String displayedText=driver.findElement(By.id("demo")).getText();
		if(displayedText.contains(name))
		{
			System.out.println("Name is displayed successfully");
		}
		else
		{
			System.out.println("Text given in alert is not received correctly");
		}
	}
}
