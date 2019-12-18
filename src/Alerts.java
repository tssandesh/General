/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String s[])
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\User2\\workspace\\Udemy\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		//driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		//driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("before clicking on multicity");
		System.out.println(driver.findElement(By.xpath("//input[@id='js-multiCitySearchTo_1']")).isDisplayed());
	    System.out.println("after click multicity");
	    driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
	    System.out.println(driver.findElement(By.xpath("//input[@id='js-multiCitySearchTo_1']")).isDisplayed());
	
	    
	    int count=driver.findElements((By.xpath("//input[@id='js-multiCitySearchTo_1']/span"))).size();
	    if(count==0)
	    {
	    	System.out.println("verified");
	    }
	}
}
*/