package org.exa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSamp {
	WebDriver driver;
	long startTime, endTime;
	
	
	@BeforeSuite
	public void launchBrowser() {
		
		startTime = System.currentTimeMillis();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void google() {
		
		driver.get("https://www.google.com/");
		
	}
	
	
	@Test(priority=1)
    public void yahoo() {
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
	}
	
	
	@Test(priority=2)
    public void bing() {
		driver.get("https://www.bing.com/");
	
}
	@AfterSuite
	public void quit() {
		driver.quit();
		
		endTime = System.currentTimeMillis();
		long totalTime = endTime-startTime;
		System.out.println("TOTAL TIME IS"+totalTime);
		
	}

}
