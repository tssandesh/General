package com.qa.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;







public class Check 
{
	
	//@Parameters({ "email" })
	//@Test(dataProvider="getdata")
	
	@Test
	public void ch () throws Exception
{
	System.setProperty("webdriver.chrome.driver","E:\\Workspace\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//driver.get("http://seleniumpractise.blogspot.com/");
	
	driver.get("https://ksrtc.in/oprs-web/guest/home.do");
	
	driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String script= "return document.getElementById(\"fromPlaceName\").value;";
	String text=(String) js.executeScript(script);
	System.out.println(text);
	
     // driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
     
  		
  	
      /*Alert alert=driver.switchTo().alert();
      Thread.sleep(5);
      System.out.println(alert.getText());
      
      alert.accept();
      
      int count=driver.findElements(By.tagName("iframe")).size();
      String link=driver.findElement(By.tagName("a")).getAttribute("href");
      System.out.println(count);
      System.out.println(link);*/
	//List<WebElement>list=driver.ge
	
	
	//driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
	
	//WebElement select=driver.findElement(By.id("tools"));
	/*Select sel=new Select(driver.findElement(By.id("tools")));
	List<WebElement> list= sel.getOptions();
	int count=list.size();
	System.out.println(count);
	sel.selectByVisibleText("Cucumber");*/
	
	//sel.selectByVisibleText("Docker");
	
	/*String Parent=driver.getWindowHandle();
	Set<String> set=driver.getWindowHandles();
	int count=set.size();
	System.out.println("no of window are" +count);
	for(String child:set)
	{
		if(!Parent.equalsIgnoreCase(child))
		{
			driver.switchTo().window(child);
			driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		}
	}*/
	/*Iterator<String> it=set.iterator();
	String parent=it.next();
	String child=it.next();
	driver.switchTo().window(child);
	driver.findElement(By.name("q")).sendKeys("selenium webdriver");*/
	
	//driver.findElement(By.id("login-username")).clear();
	//driver.findElement(By.id("login-username")).sendKeys(email);
	//driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	//String expected="https://login.yahoo.com";//driver.getTitle();
	//String actual="Googlee";
	
	/*if(expected.equals(driver.getCurrentUrl()))
	{
		System.out.println("matched");
	}else
	{
		System.out.println("Not matched");
	}*/
	//Assert.assertEquals(expected, actual);
	//System.out.println("true");
}
	/*@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="test@yahoo.com";
		data[1][0]="man@yahoo.com";
		data[2][0]="cat@yahoo.com";
		return data;
	}*/
}


	

