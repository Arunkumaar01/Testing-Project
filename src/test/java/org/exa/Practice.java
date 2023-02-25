package org.exa;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args) {
		
		//setting the property of browser
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		Duration duration = Duration.ofSeconds(100000);
		driver.manage().timeouts().implicitlyWait(duration);
		
		driver.get("https://www.instagram.com/");
		
	}

}
