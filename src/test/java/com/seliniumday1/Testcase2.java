package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		SDFC();

	}
	public static void SDFC() { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");  
		

		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("2023@tekarc.com"); 

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Dareram@30");  
		
		WebElement rememberme =	driver.findElement(By.xpath("//label[text()='Remember me']"));
		rememberme.click(); 
		
		WebElement login = driver.findElement(By.id("Login"));
		
		login.click();	
		
		
		
	}
}
