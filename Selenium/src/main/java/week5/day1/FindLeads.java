package week5.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindLeads extends ProjectSpecificMethods
{ 
	@Test
	public void runFindLeads()
	{
		login();
		LoadFindLeadsPage(driver);
		SearchWithEmail(driver);
		ViewResultsbyLeadNumber(driver);
		EditLead(driver);
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
}
