/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Xpath 
{
	public static void main(String s[])
	{
		System.setProperty("webdriver.chrome.driver","E:\\Workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","E:\\Workspace\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver","E:\\Workspace\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		
		driver.get("https://www.google.com/gmail/about/");
		//driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		driver.findElement(By.xpath("//div[@class='get-custom-for-gmail flex-container__content']/span/a")).click();
		//driver.findElement(By.xpath("//div[@lass='standard-footer__bar__social-icons']/a[1]")).click();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("good for all");;
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("passw");;
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("goog");
	    driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("password");
	driver.findElement(By.cssSelector("label[id='loginbutton']")).click();
	}

}
*/