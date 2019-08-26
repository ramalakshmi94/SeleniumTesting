package week4.cw;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leaftaps 
{
	public static ChromeDriver LaunchBrowser()
	{
		//Launch the browser
		//alternate for setProperty is setting the environment variable->system variable->path-> chromedriver path
		//System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Browser Launched");
		return driver;
	}
	
	public static void LaunchUrl(ChromeDriver driver, String URL,String Title)
	{
		//launch LEAFTAPS url
		driver.get(URL);
		driver.manage().window().maximize();
		if(checkTitle(driver, Title))
		System.out.println(URL+" is opened");
	}
	
	public static void Login(ChromeDriver driver,String UserName,String Password,String Title)
	{
		//Enter the username
		driver.findElementById("username").sendKeys(UserName);
		//Enter the password
		driver.findElementById("password").sendKeys(Password);
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		if(checkTitle(driver,Title))
		System.out.println(Title+" Login Successful");
	}
	
	public static void navigateByLinkText(ChromeDriver driver,String Link)
	{
		driver.findElementByLinkText(Link).click();
		System.out.println("Navigated to "+Link);
	}
	
	public static boolean checkTitle(ChromeDriver driver,String Title)
	{
		return driver.getTitle().contains(Title);
	}
	
	public static void LoadFindLeadsPage(ChromeDriver driver)
	{
		//Click Leads link
		navigateByLinkText(driver,"Leads");
		//driver.findElement(By.linkText("Leads")).click();
		//Click Find leads
		navigateByLinkText(driver,"Find Leads");
		//driver.findElement(By.linkText("Find Leads")).click();	
		if(checkTitle(driver,"Find Leads"))
		System.out.println("Find Leads page Loaded");
	}
	
	public static void SearchWithEmail(ChromeDriver driver)
	{
		//Click email Tab	
		driver.findElementByXPath("//span[text()='Email']").click();
		//Enter emailId
		driver.findElementByName("emailAddress").sendKeys("");
		//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		System.out.println("Search with email completed");
	}
	
	public static String ViewResultsbyLeadNumber(ChromeDriver driver)
	{
		//Click on first resulting lead
		 WebElement Lead = driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr[1]/td[not(contains(@style,'none'))])[1]//a");
		 String LeadNumber =Lead.getText();
		 Lead.click();
		 if(checkTitle(driver,"View Lead"))
		 {
			System.out.println("Navigated to View Lead Page");
		 }
		 return LeadNumber;
	}
	
	public static String ViewResultsbyLeadName(ChromeDriver driver)
	{
		//Capture name of First Resulting lead
		WebElement LeadName= driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr[1]/td[not(contains(@style,'none'))])[2]//a");
		String LeadFirstName=LeadName.getText();
		LeadName.click();
		if(checkTitle(driver,"View Lead"))
		 {
			System.out.println("Navigated to View Lead Page");
		 }
		return LeadFirstName;			
	}
	
	public static void EditLead(ChromeDriver driver)
	{
		 String NewCompanyToBeEntered="NewCompName";
		//Click Edit
		 driver.findElementByLinkText("Edit").click();
		 //change company name
		 driver.findElementById("updateLeadForm_companyName").clear();
		 driver.findElementById("updateLeadForm_companyName").sendKeys(NewCompanyToBeEntered);
		 //click Update
		 driver.findElementByName("submitButton").click();
		 System.out.println("Company name Edit completed");
		 //Confirm the changed company name appears
		 String NewCompanySaved = driver.findElementById("viewLead_companyName_sp").getText();
		 if(NewCompanySaved.startsWith(NewCompanyToBeEntered))
			 System.out.println("Company name after Editing is "+NewCompanySaved);
		 else 
			 System.out.println("Company name not Saved as expected");
	}
	
	public static void DeleteLead(ChromeDriver driver,String LeadNumber)
	{
			////Delete Lead
			driver.findElementByLinkText("Delete").click();
			//Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();
			//Enter captured lead ID
			driver.findElementByName("id").sendKeys(LeadNumber);
			//Click Find leads button
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			//Verify 'No Records Found' Message appears 
			if(driver.findElementByXPath("//div[text()='No records to display']").getText().contains("No records"))
			System.out.println("Record "+LeadNumber+" deleted successfully");
	}
	
	public static void DuplicateLead(ChromeDriver driver,String LeadName)
	{
		//click Duplicate Lead
				driver.findElementByLinkText("Duplicate Lead").click();
				
				//verify the title as Duplicate Leads
				if(driver.getTitle().contains("Duplicate Lead"))
				{
					System.out.println("Page Title is Duplicate Lead: Verified");
					//click create Lead
					driver.findElementByName("submitButton").click();
					//Confirm the duplicated lead name is same as captured name in Step 12
					if(driver.findElementById("viewLead_firstName_sp").getText().equals(LeadName))
					{
						System.out.println("Duplicate lead name is same as the original Lead name");
					}
					else
					{
						System.out.println("Duplicate lead name doesnt match with original Lead Name");
					}
				}
	}

	public static void main(String[] args) throws InterruptedException
	{
		//Initializations
		String UserName = "demosalesmanager";
		String Password = "crmsfa";
		String LeaftapsURL="http://leaftaps.com/opentaps";
		String LeadName,LeadNumber;
		
		//calling methods
		ChromeDriver driver=LaunchBrowser();
		LaunchUrl(driver,LeaftapsURL,"Leaftaps");
		Login(driver,UserName,Password,"Leaftaps");
		
		//click CRM/SFA Link
		navigateByLinkText(driver,"CRM/SFA");
		
	/*	LoadFindLeadsPage(driver);
		SearchWithEmail(driver);
		//Add Sleep 5000 ms
		Thread.sleep(5000);
		LeadNumber=ViewResultsbyLeadNumber(driver);
		System.out.println("Viewing results of "+LeadNumber);
		EditLead(driver);
	
		LoadFindLeadsPage(driver);
		SearchWithEmail(driver);
		Thread.sleep(5000);
		LeadNumber=ViewResultsbyLeadNumber(driver);
		System.out.println("Deleting "+LeadNumber);
		DeleteLead(driver,LeadNumber);	
			
		LoadFindLeadsPage(driver);
		SearchWithEmail(driver);
		Thread.sleep(5000);
		LeadName=ViewResultsbyLeadName(driver);
		System.out.println("Duplicating "+LeadName);	
		DuplicateLead(driver,LeadName);*/
		
		driver.findElement(By.linkText("Leads")).click();;
		driver.findElement(By.linkText("Merge Leads")).click();
		//WebElement partyIdFrom = driver.findElement(By.id("widget_ComboBox_partyIdFrom"));
		driver.findElement(By.xpath("//*[@id='widget_ComboBox_partyIdFrom']//following-sibling::a/img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		ArrayList<String> windows=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		SearchWithEmail(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		/*WebElement Lead1 = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]");
		String MergeLeadFromNumber1 =Lead1.getText();
		System.out.println(MergeLeadFromNumber1);
		Lead1.click();*/
		int retry=0;
		while(true)
		{
			try
			{
			System.out.println("retry count:"+retry);
			WebElement Lead = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]");
			String MergeLeadFromNumber =Lead.getText();
			System.out.println(MergeLeadFromNumber);
			Lead.click();
			retry++;
			System.out.println(retry);
			return;
			}
			catch(StaleElementReferenceException e)
			{
				if(retry<=5)
				continue;
				else
				throw e;
			}
		}
		
		//close the browser
		//driver.quit();
	}
}
