/*import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
public static void main(String s[])
{
	System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();

	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	WebDriverWait wait=new WebDriverWait(driver, 30);
	WebElement w=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	boolean status=w.isDisplayed();
	if(status)
	{
		System.out.println("visible");
	}else
	{
		System.out.println("invisible");
	}
	
}
}
*/