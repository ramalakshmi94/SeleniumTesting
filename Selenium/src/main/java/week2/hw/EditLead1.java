package week2.hw;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead1
{

	public static void main(String[] args) throws InterruptedException
	{
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
		//launch LEAFTAPS url
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		//Enter the username
		driver.findElementById("username").sendKeys("demosalesmanager");
		//Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
	
		//click CRM/SFA Link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();			
	
		//Click email Tab	
		driver.findElementByXPath("//span[text()='Email']").click();
		//Enter emailId
		driver.findElementByName("emailAddress").sendKeys("a");
		//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		 //Add Sleep 5000 ms
		Thread.sleep(5000);
		
		//Click on first resulting lead
		 WebElement Lead = driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr[1]/td[not(contains(@style,'none'))])[1]//a");
		 String LeadNumber =Lead.getText();
		 Lead.click();
	System.out.println(LeadNumber);
		
		//verify the Title
		System.out.println("Page Title is-->"+driver.getTitle());
		
		//Click Edit
		 driver.findElementByLinkText("Edit").click();

		 String NewCompanyToBeEntered="NewCompName";
		 //change company name
		 driver.findElementById("updateLeadForm_companyName").clear();
		 driver.findElementById("updateLeadForm_companyName").sendKeys(NewCompanyToBeEntered);
		 
		 //click Update
		 driver.findElementByName("submitButton").click();
		 
		 //Confirm the changed company name appears
		 String NewCompanySaved = driver.findElementById("viewLead_companyName_sp").getText();
		 System.out.println(NewCompanySaved.startsWith(NewCompanyToBeEntered));

		////Delete Lead
			driver.findElementByLinkText("Delete").click();
			 
			//Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();
			
			//Enter captured lead ID
			driver.findElementByName("id").sendKeys(LeadNumber);
			
			//Click Find leads button
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			//Verify 'No Records Found' Message appears
			WebElement resultStatus=driver.findElementByXPath("//div[text()='No records to display']"); 
			System.out.println(resultStatus.getText().contains("No records"));

			//Click Leads link
			driver.findElement(By.linkText("Leads")).click();
			//Click Find leads
			driver.findElement(By.linkText("Find Leads")).click();			
		
			//Click email Tab	
			driver.findElementByXPath("//span[text()='Email']").click();
			//Enter emailId
			driver.findElementByName("emailAddress").sendKeys("a");
			//Click Find leads button
			driver.findElementByXPath("//button[text()='Find Leads']").click();

			 //Add Sleep 5000 ms
			Thread.sleep(5000);
			
		//Capture name of First Resulting lead
				WebElement LeadName= driver.findElementByXPath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr[1]/td[not(contains(@style,'none'))])[2]//a");
				String LeadFirstName=LeadName.getText();
				LeadName.click();
				
		//click Duplicate Lead
		driver.findElementByLinkText("Duplicate Lead").click();
		
		//verify the title as Duplicate Leads
		if(driver.getTitle().contains("Duplicate Lead"))
		{
			System.out.println("Page Title is Duplicate Lead: Verified");
			//click create Lead
			driver.findElementByName("submitButton").click();
			//Confirm the duplicated lead name is same as captured name in Step 12
			if(driver.findElementById("viewLead_firstName_sp").getText().equals(LeadFirstName))
			{
				System.out.println("Duplicate lead name is same as the original Lead name");
			}
			else
			{
				System.out.println("Duplicate lead name doesnt match with original Lead Name");
			}
		}
		
		
		//close the browser
		driver.quit();
	}

}
