package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase4b {
	static WebDriver driver;
	public static void main(String[] args) {
		errorlog();

	}
public static void errorlog() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/"); 
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("123"); 

	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("22123");  
	
	WebElement rememberme =	driver.findElement(By.xpath("//label[text()='Remember me']"));
	rememberme.click(); 
	
	WebElement login = driver.findElement(By.id("Login"));
	
	login.click();   
}
}
