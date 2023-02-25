package org.exa;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitPract {
	static WebDriver driver;
	@BeforeClass
	public static void tc1() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("before class");
	}
	@Before
    public void tc2() {
    	
		driver.get("https://www.facebook.com/login/");
		System.out.println("before");
	}
	@Test
    public void tc3() {
	 
	driver.findElement(By.id("email")).sendKeys("arunr232@gmail.com");	
	driver.findElement(By.id("pass")).sendKeys("Arunr@0111");
	System.out.println("test1");
    }
	@Test
    public void tc4() {
		driver.findElement(By.id("email")).sendKeys("arunr232@gmail.com");	
		driver.findElement(By.id("pass")).sendKeys("Arunr@0111");
		driver.findElement(By.name("login")).click();
		System.out.println("test2");
    }
    @After
    public void tc5() throws IOException {
    	TakesScreenshot ts =(TakesScreenshot) driver;
    	
    	File ss = ts.getScreenshotAs(OutputType.FILE);
    	
    	File file = new File("C:\\Users\\DELL\\OneDrive\\Documents\\CLASS\\FRAMEWORK\\DAY 3\\ss.png");
    	
    	FileUtils.copyFile(ss, file);
    			
        System.out.println("after");
	
    }
    @AfterClass
    public static void tc6() {
    	
    	driver.quit();
	
    }


}
