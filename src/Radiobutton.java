/*import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton 
{
public static void main(String s[])
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\User2\\workspace\\Udemy\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	 driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
	
	 driver.manage().window().maximize();
	 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 WebElement link=driver.findElement(By.tagName("a"));
	 String url=link.getAttribute("href");
	// String link=driver.findElements(By.tagName("a")).getAttribute("href");
	// driver.findElement(By.xpath("//input[@value='Login']"));
	 
	List<WebElement> link=driver.findElements(By.tagName("a"));
		for(WebElement el:link)
	{
		String url=el.getAttribute("href");
		
	}
	 
	 Select sel = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

	//Getting all the options present in the dropdown.
	List<WebElement> list = sel.getOptions();

	
	//Printing the List
	System.out.println("The list without the first element, i.e., 'Select Type' is as under: ");

	for(WebElement ele: list)
	    System.out.println(ele.getText());

List<WebElement> col=driver.findElements(By.xpath("/table/tr/td"));
System.out.println("column"+col.size());


List<WebElement> row=driver.findElements(By.xpath("/table/tr/td"));
System.out.println("row"+row.size());



}
}
*/