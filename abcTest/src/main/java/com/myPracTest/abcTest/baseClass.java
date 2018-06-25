package com.myPracTest.abcTest;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	
	public void launchurl() {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C://Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.google.com";
		driver.get(url);
		//driver.manage().window().maximize();
		
		WebElement head1 = driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[1]"));
		
		
		System.out.println(head1.getText());
		System.out.println(head1.isDisplayed());
		
		assertEquals(head1.getText(), "About");
		
		
		driver.quit();
	}

}
