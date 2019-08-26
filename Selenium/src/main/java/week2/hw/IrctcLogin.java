package week2.hw;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcLogin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver/Chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByLinkText("REGISTER").click();
		WebElement CountryDropdown = driver.findElement(By.xpath("//select[@formcontrolname='resCountry']"));
		Select country=new Select(CountryDropdown);
		String secondoption =driver.findElements(By.xpath("//select[@formcontrolname='resCountry']/option[starts-with(text(),'E')]")).get(1).getText();
		//System.out.println(secondoption);
		//driver.findElements(By.xpath("//select[@formcontrolname='resCountry']/option[starts-with(text(),'E')]")).get(1).click();
		country.selectByVisibleText(secondoption);
		/*getting list of countries starting with E
		List<WebElement> countriesBeginningWithE = driver.findElements(By.xpath("//select[@formcontrolname='resCountry']/option[starts-with(text(),'E')]"));		
	
		//size of the List retrieved above
		System.out.println(countriesBeginningWithE.size());
		
		//selecting the second country from the list of countries starting with 'E'
		System.out.println(countriesBeginningWithE.get(1).getText());
		countriesBeginningWithE.get(1).click();
		*/
		
		System.out.println(driver.findElementById("sbi").isSelected());
	}	
	
}	
