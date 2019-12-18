/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdev {
	public static void main(String s[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User2\\workspace\\Udemy\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;

		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Home").build().perform();
	    a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
	}

}
*/