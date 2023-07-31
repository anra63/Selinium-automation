package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SeliniumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com"); 
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("anupriya@gm"); 
		
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("Pass2323");
		
		WebElement login = driver.findElement(By.id("Login")); 
		login.click();
	}

}
