package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase4a {
	static WebDriver driver;
	public static void main(String[] args) {
		forgotpassword();

	}
	public static void forgotpassword() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/"); 
		WebElement forgotp = driver.findElement(By.xpath("//a[text()='Forgot Your Password?']"));
		forgotp.click(); 
		WebElement check = driver.findElement(By.id("un"));
		check.sendKeys("2023@tekarc.com");
		WebElement cot = driver.findElement(By.id("continue")); 
		cot.click();
	}
}
