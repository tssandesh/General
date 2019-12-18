/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
		
		
		System.setProperty("webdriver.gecko.driver","E:\\Workspace\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("tssand1989@gmail.com");;
	     driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("tinkusandesh9");
	     driver.findElement(By.xpath("//*[@id='loginbutton']")).click();

		System.setProperty("webdriver.ie.driver","E\\Workspace\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
	     driver.findElement(By.cssSelector("#email")).sendKeys("tssand1989@gmail.com");;
	     driver.findElement(By.cssSelector("#pass")).sendKeys("tinkusandesh9");
	     driver.findElement(By.cssSelector("#loginbutton")).click();
		System.setProperty("webdriver.ie.driver","E\\Workspace\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
	     
	}

}
*/