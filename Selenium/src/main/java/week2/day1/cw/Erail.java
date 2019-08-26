package week2.day1.cw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail //table[@class='DataTable TrainList TrainListHeader']
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("Chennai Egmore",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Nagercoil",Keys.TAB);
		Thread.sleep(4000);
		WebElement trainsList = driver.findElementByXPath("//div[@id='divTrainsList']/table[contains(@class,'TrainList')]");
		WebElement columnsheader =driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
		List<WebElement> rows = trainsList.findElements(By.tagName("tr"));
		int rowsize = rows.size();
		System.out.println("No of Rows: "+rowsize);
		List<WebElement> Rowdata = columnsheader.findElements(By.tagName("td"));
		int column =Rowdata.size();
		System.out.println("No of Columns: "+column);
		WebElement lastrow =trainsList.findElements(By.tagName("tr")).get(rowsize-1);
		String trainnum = lastrow.findElements(By.tagName("td")).get(0).getText();
		System.out.println("First Train Number is "+trainnum);
		List<String> TrainNameListNotSorted = new ArrayList<String>();
		List<WebElement> ElementInputNotSorted=driver.findElements(By.xpath("//div[@id='divTrainsList']/table[contains(@class,'TrainList')]//tr/td[2]/a"));
		for(WebElement eachTrain:ElementInputNotSorted)
		{ 
		String TrainName= eachTrain.getText();
		System.out.println(TrainName);
		TrainNameListNotSorted.add(TrainName);
		}
		System.out.println(TrainNameListNotSorted);
		ArrayList<String> TrainNameListSorted = new ArrayList<String>(TrainNameListNotSorted);
		Collections.sort(TrainNameListSorted);
		//SortedList of Train names
		System.out.println(TrainNameListSorted);
		//Sorting train names in alphabetical order
		driver.findElement(By.linkText("Train Name")).click();
		List<WebElement> ElementInputSorted=driver.findElements(By.xpath("//div[@id='divTrainsList']/table[contains(@class,'TrainList')]//tr/td[2]/a"));
		List<String> TrainsNameInputSorted=new ArrayList<String>();
		for(WebElement eachTrain:ElementInputSorted)
		{ 
		String TrainName= eachTrain.getText();
		System.out.println(TrainName);
		TrainsNameInputSorted.add(TrainName);
		}
		boolean equal=TrainsNameInputSorted.equals(TrainNameListSorted);
		boolean equals=TrainsNameInputSorted.equals(TrainNameListNotSorted);
		System.out.println(equal);
		System.out.println(equals);
		
	}
}
