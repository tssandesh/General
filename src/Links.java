/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String s[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User2\\workspace\\Udemy\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement element=driver.findElement(By.xpath(".//footer[@id='glbfooter']")); 
		System.out.println(element.findElements(By.tagName("a")).size());
		
		WebElement el=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(el.findElements(By.tagName("a")).size());
		
		String Beforeclick=null;
		String Afterclick;
		
		for(int i=0;i<el.findElements(By.tagName("a")).size();i++)
          {
			if(el.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{	
			Beforeclick=driver.getTitle();
			
				el.findElements(By.tagName("a")).get(i).click();
				break;
			}
	//System.out.println(ele.findElements(By.tagName("a")).get(i).getText());
          }
		Afterclick=driver.getTitle();
		if(Beforeclick!=Afterclick)
		{
			if(driver.getPageSource().contains("Sitemap"))
			System.out.println("pass");
		}
		else
			{
				System.out.println("fail");
			}
		
			
		
		//driver
          
		}
}*/