package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase5 {
	static WebDriver driver;
	public static void main(String[] args) {
		usermenu();

	}
	public static void usermenu() {
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

		WebElement userbutton = driver.findElement(By.xpath("//span[contains(text(),'Anup ABCD')]"));
		userbutton.click(); 
		WebElement myprofile =	driver.findElement(By.xpath("//a[text()='My Profile']"));
		myprofile.isDisplayed(); 
		WebElement mysettings =	driver.findElement(By.xpath("//a[text()='My Settings']"));
		Assert.assertTrue(mysettings.isDisplayed()); 
		WebElement developerconsole = driver.findElement(By.xpath("//a[@class=\"debugLogLink menuButtonMenuLink\"]"));
		Assert.assertTrue(developerconsole.isDisplayed());
//		WebElement switchtolightning  = driver.findElement(By.xpath("));
//		switchtolightning.isDisplayed();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		Assert.assertTrue(logout.isDisplayed()); 
		System.out.println("All testcase pass");
	}
}
