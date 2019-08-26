package week2.day1.cw;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) 
	{
		//set the path of chrome driver
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		
		//create driver object
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		
		//access the wepage elements
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Temenos");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ramalakshmi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Sankaran");
		
		//find the Dropdown element and store it in a variable
		WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		//create an object of Select class
		Select select =new Select(MarketingCampaign);
		//get the options in the dropdown
		List<WebElement> MarketingCampaignOptions = select.getOptions();
		//find the number of options in the dropdown
		int size= MarketingCampaignOptions.size();
		//select the last option in the dropdown
		//selectByIndex
		select.selectByIndex(size-1);
		
		//SelectByValue
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select selectIndustry=new Select(Industry);
		selectIndustry.selectByValue("IND_SOFTWARE");
		
		//selectByVisibleText
		WebElement Source=driver.findElementById("createLeadForm_dataSourceId");
		Select selectSource=new Select(Source);
		selectSource.selectByVisibleText("Conference");
		
		//Alternate option to select an element using the position
		WebElement Currency = driver.findElementById("createLeadForm_currencyUomId");
		Select Currency1 = new Select(Currency);
		List<WebElement> CurrencyOptions = Currency1.getOptions();
		CurrencyOptions.get(1).click();
		
		/*driver.findElementByName("submitButton").click();*/	
	}
}
