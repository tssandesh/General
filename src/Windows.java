/*import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
	public static void main(String s[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User2\\workspace\\Udemy\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://accounts.google.com/Signup");
		//driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts/answer/1733224?hl=en']")).click();
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println("Before switchong");
		System.out.println(driver.getTitle());
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		String parentid=itr.next();
		String childid=itr.next();
		driver.switchTo().window(childid);
		System.out.println("After switching");
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		}
}
*/