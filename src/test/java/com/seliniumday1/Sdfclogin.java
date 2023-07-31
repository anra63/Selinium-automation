package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sdfclogin { 
	
	private WebDriver driver;
	
	public Sdfclogin() {
		WebDriverManager.chromedriver().setup(); 
		this.driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Sdfclogin sdfc = new Sdfclogin();
		sdfc.login();
		 
		
	} 
	
	public  void login() {
	
		
	
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
