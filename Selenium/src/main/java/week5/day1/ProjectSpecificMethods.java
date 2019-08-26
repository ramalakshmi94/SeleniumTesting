package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ProjectSpecificMethods 
{
	/*public static void main(String[] args)
	{
		ProjectSpecificMethods f= new ProjectSpecificMethods();
		f.login();
	}*/
	public ChromeDriver driver;
	@Parameters({"url"})
	@BeforeMethod
	public void login(String url)
	{
		String UserName = "demosalesmanager";
		String Password = "crmsfa";
		//Launch the browser
		//alternate for setProperty is setting the environment variable->system variable->path-> chromedriver path
		//System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Browser Launched");
		//launch LEAFTAPS url
		driver.get(url);
		driver.manage().window().maximize();
		if(checkTitle(driver, "Leaftaps"))
		System.out.println("URL is opened");
		
		//Enter the username
		driver.findElementById("username").sendKeys(UserName);
		//Enter the password
		driver.findElementById("password").sendKeys(Password);
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		if(checkTitle(driver,"Leaftaps"))
		System.out.println(" Login Successful");
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	public static void LoadFindLeadsPage(ChromeDriver driver)
	{
		//Click Leads link
		driver.findElementByLinkText("Leads");
		//driver.findElement(By.linkText("Leads")).click();
		//Click Find leads
		driver.findElementByLinkText("Find Leads");
		//driver.findElement(By.linkText("Find Leads")).click();	
		if(checkTitle(driver,"Find Leads"))
		System.out.println("Find Leads page Loaded");
	
	}
	
	public static void SearchWithEmail(ChromeDriver driver)
	{
		//Click email Tab	
		driver.findElementByXPath("//span[text()='Email']").click();
		//Enter emailId
		driver.findElementByName("emailAddress").sendKeys("a");
		//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		System.out.println("Search with email completed");
	}

	public static boolean checkTitle(ChromeDriver driver,String Title)
	{
		return driver.getTitle().contains(Title);
	}
	

}
