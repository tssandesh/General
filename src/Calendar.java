/*import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Calendar {
	public static void main(String s[])
	{
		
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\User2\\workspace\\Udemy\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.path2usa.com/travel-companions");
	driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
	
	while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("april"))
	{
		//WebDriverWait wait=new WebDriverWait(driver, 5);
		
	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	}
	
	List<WebElement> ele=driver.findElements(By.className("day"));
	int count=driver.findElements(By.className("day")).size();
	
	for(int i=0;i<count;i++)
	{
		String text=driver.findElements(By.className("day")).get(i).getText();
				if(text.equalsIgnoreCase("24"));
				{
					driver.findElements(By.className("day")).get(i).click();
					break;
				}
	}
}
}*/