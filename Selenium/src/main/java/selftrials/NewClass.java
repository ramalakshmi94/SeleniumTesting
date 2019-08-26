package selftrials;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.utils.FileUtil;

public class NewClass
{
	int num;
public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	String xf="12";
	//System.out.print(sc.delimiter());
	/*sc.nextInt();
	System.out.println(sc.nextLine());*/
	//System.out.println(sc.hasNext());
	//sc.useDelimiter(xf);
	//System.out.println(sc.next());
	/*System.out.println("nextint(3)"+sc.hasNextInt(2));
	System.out.println(sc.toString());
	
	System.out.println(sc.radix());
	*/System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	WebDriverWait wait= new WebDriverWait(driver,30);
	driver.get("https://facebook.com");
	//Thread.sleep(5000);
	System.out.println(driver.getCapabilities());
	char drive='F';
	String format=".png";
	TakesScreenshot ss=((TakesScreenshot)driver);
	File filesrc =	ss.getScreenshotAs(OutputType.FILE);
	File Destsrc = new File(drive+":/"+System.currentTimeMillis()+format);
	FileUtils.copyFile(filesrc, Destsrc);
	
}

}


