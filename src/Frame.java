/*import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {
	
			public static void main(String s[])
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User2\\workspace\\Udemy\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			System.out.println(driver.findElements(By.tagName("iframe")).size());
			driver.switchTo().frame(0);
			//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
            //driver.findElement(By.id("draggable")).click();	
            Actions a =new Actions(driver);
            WebElement source=driver.findElement(By.id("draggable"));
            WebElement destination=driver.findElement(By.id("droppable"));
            
            a.dragAndDrop(source, destination).build().perform();
            driver.switchTo().defaultContent();
		    	
		}
	}

*/