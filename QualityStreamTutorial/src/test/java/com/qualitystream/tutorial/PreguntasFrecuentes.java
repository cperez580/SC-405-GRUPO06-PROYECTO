package com.qualitystream.tutorial;

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


public class PreguntasFrecuentes {

private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cafsa.fi.cr/preguntas-frecuentes/");
		
	}
	
	@Test
	
	public void testPreguntasFrecuentes() {
		
		WebElement searchbox = driver.findElement(By.linkText("ARRENDAMIENTO"));
		searchbox.click();
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement searchbox2 = driver.findElement(By.linkText("INVERSIONES Y PLANES DE AHORRO"));
		searchbox2.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement searchbox3 = driver.findElement(By.linkText("CRÉDITO"));
		searchbox3.click();

		
		
		
	}

	
	
}
