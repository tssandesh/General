/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Regular
{
public static void main(String s[])
{
	System.setProperty("webdriver.chrome.driver","E:\\Workspace\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.gecko.driver","E:\\Workspace\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://www.rediff.com/");
    driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
    driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("how are you");
    driver.findElement(By.cssSelector("input#password")).sendKeys("passwrd");
    driver.findElement(By.cssSelector("input[value*='Go']")).click();
	driver.get("http://www.spicejet.com/");
	Select s1= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	s1.selectByValue("2");
	s1.selectByIndex(4);
	s1.selectByVisibleText("6");
	
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.xpath("//a[@value='GOI']")).click();
	driver.findElement(By.xpath("(//a[@value='IXE'])[2]")).click();
	
	System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_Unmr']")).isSelected());//("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).click();
	System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
}
}
*/