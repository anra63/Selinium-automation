package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 { 
	static WebDriver driver;
	
	public static void main (String[] args) {
		usernamecheck();
	}
	public static void usernamecheck() {
		
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
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("Driver Content ===>"+driver.getPageSource());
//		driver.navigate("")
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click(); 
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement validateuser = driver.findElement(By.xpath("//span[@id=\"idcard-identity\"]"));
		String Actualtext = validateuser.getText();
		String Exceptedtext = "2023@tekarc.com";
		Assert.assertEquals(Actualtext, Exceptedtext);
		
		//pass
	}
}
