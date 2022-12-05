package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.nio.channels.SelectableChannel;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RedireccionPurdycard {
	
private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cafsa.fi.cr/purdy-card/");
		
	}
	
	@Test
	
	public void testBotonIbanking() {
		
		WebElement searchbox = driver.findElement(By.linkText("SI"));
		searchbox.click();

		
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		
		
		
	}

}
