/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selnium {

	public static void main(String s[])
	{
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\User2\\workspace\\Udemy\\geckodriver.exe");
	//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
	
	//WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	
	//driver.get("https://www.google.co.in/?gws_rd=ssl");
	//.findElement(By.className("news")).sendKeys("good");
	driver.findElement(By.id("email")).sendKeys("hi can i login");
	driver.findElement(By.name("pass")).sendKeys("123456");
	driver.findElement(By.linkText("Forgotten account?")).click();
	driver.close();

	//driver.get("https://login.salesforce.com");
	//driver.get("http://www.echoecho.com/htmlforms10.htm");
	//driver.get("https://www.freecrm.com");
	driver.get("https://appzoojoo.be/");
	//driver.get("https://www.google.co.in/");
	driver.findElement(By.name("email")).sendKeys("sandesh+1@zoojoo.be");
	driver.findElement(By.xpath("//button[@class='nextButton']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	WebElement wrt=driver.findElement(By.name("password"));//.sendKeys("Zoojoobe@1");
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(wrt));
	wrt.sendKeys("Zoojoobe@1");
	driver.findElement(By.xpath("//button[@class='nextButton']")).click();
	//WebDriverWait wait=new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']"))).click();
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.id("username")).sendKeys("hi can i login");
	driver.findElement(By.id("password")).sendKeys("hi can");
	//driver.findElement((By.xpath("//*[@id='loginbutton']"))).click();
	driver.findElement(By.cssSelector("#email")).sendKeys("tssand1989@gmail.com");
	driver.findElement(By.cssSelector("#pass")).sendKeys("Tinkusandesh9");
	driver.findElement(By.cssSelector("#loginbutton")).click();
	//driver.findElement(By.xpath("//div[@class='gb_nb gb_Lg gb_R gb_Kg gb_Og gb_T']/div/div[2]/a")).click();
	//driver.findElement(By.xpath("//div[@class='gb_da gb_9c gb_R']/following-sibling::div[1]")).click();
	//driver.findElement(By.xpath("//div[@class='gb_da gb_9c gb_R']/parent::div")).click();
	//driver.findElement(By.xpath("//*[@text()='Privacy']")).click();
	//driver.findElement(By.xpathgb_Q gb_R("//div[@class='fullname_field']/div/div/div/div/div/input")).sendKeys("2764389273");
	Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	s1.selectByValue("6");
	s1.selectByIndex(2);
	s1.selectByVisibleText("4");
	
	driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.xpath("//a[@value='GOI']")).click();
	driver.findElement(By.xpath("(//a[@value='IXE'])[2]")).click();
	
   // driver.findElement(By.xpath("//input[@value='Milk']")).click();
    
    
    int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
    
    for(int i=0;i<count;i++)
    {
    	String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
    	if (text.equals("Cheese"))
    	{
    	 driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
    	}
    }
    
	}}



*/