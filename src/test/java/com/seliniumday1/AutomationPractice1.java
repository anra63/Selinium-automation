package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class AutomationPractice1 {

	public static void main(String[] args) {
		
		login();
	} 
		
	public static void login() { 
		WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/"); 
		
//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("2023@tekarc.com"); 
//		
		WebElement rememberme =	driver.findElement(By.xpath("//label[text()='Remember me']"));
		rememberme.click(); 
		
		WebElement validateuser = driver.findElement(By.xpath("//span[@id=\"idcard-identity\"]"));
		String Actualtext = validateuser.getText();
		String Exceptedtext = "2023@tekarc.com";
		Assert.assertEquals(Actualtext, Exceptedtext);
		
		
		
	
//		WebElement forgotp = driver.findElement(By.xpath("//a[text()='Forgot Your Password?']"));
//		forgotp.click(); 
//		WebElement check = driver.findElement(By.id("un"));
//		check.sendKeys("2023@tekarc.com");
//	  WebElement cot = driver.findElement(By.id("continue")); 
//	  cot.click();
//	  
	  

//	WebElement password = driver.findElement(By.id("password"));
//	password.sendKeys("Dareram@30"); 
//	WebElement login = driver.findElement(By.id("Login"));
//	login.click();   
//	try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	WebElement userbutton = driver.findElement(By.xpath("//span[contains(text(),'Anup ramkumar')]"));
//	userbutton.click();
//	WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
//	logout.click();
//		
		
	
	
	
	
	
//	
//	Actions action = new Actions(driver);
//	action.moveToElement(userbutton).build().perform();
//		
//		WebElement Anup = driver.findElement(By.xpath("//span[contains(text(),'Anup ramkumar')]"));
//	Select Anup ramkumar = new Select(Anup);
//	Anupramkumar.selectByVisibleText("Logout");
		
	}

	
	
}
