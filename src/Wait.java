/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String s[])
	{
		System.setProperty("webdriver.gecko.driver","E:\\Workspace\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.id("tab-hotel-tab")).click();
		driver.findElement(By.id("hotel-destination")).sendKeys("New york");
		driver.findElement(By.id("hotel-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("hotel-checkin")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-WestHouse-New-York')]")).click();
		WebDriverWait d=new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[id='16115']/div[2]/div[1]/a")));

}}
*/