package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculation {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://selenium-prd.firebaseapp.com/"); 
		WebElement username = driver.findElement(By.xpath("//input[@id='email_field']"));
		username.sendKeys("anu.ram63@gmail.com"); 

		WebElement password = driver.findElement(By.xpath("//input[@id='password_field']"));
		password.sendKeys("Anupriya@24");  
		WebElement login = driver.findElement(By.xpath("//button[text()='Login to Account']"));
		
		login.click();	
		
	}

}
