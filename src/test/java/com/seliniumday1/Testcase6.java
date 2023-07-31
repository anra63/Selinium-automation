package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase6 {
	static WebDriver driver;
	public static void main(String[] args) {
		launch();
		myprofile(); 
		about(); 
		post();
		filelink();
	}
	public static void launch() {
		
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
	public static void myprofile() {
		WebElement userbutton = driver.findElement(By.xpath("//span[contains(text(),'Anup ABCD')]"));
		userbutton.click(); 
		
		WebElement myprofile =	driver.findElement(By.xpath("//a[text()='My Profile']"));
		myprofile.click();  
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement edit =	driver.findElement(By.xpath("//a[@class=\"contactInfoLaunch editLink\"]"));
		edit.click(); 
		
	} 
		public static void about() { 
			WebElement iframe= driver.findElement(By.xpath("//iframe[@id=\"contactInfoContentId\"]"));
			driver.switchTo().frame(iframe);
			
			WebElement about= driver.findElement(By.xpath("//a[contains(text(),'About')]"));
			about.click(); 
			
			WebElement saveall= driver.findElement(By.xpath("//input[@value=\"Save All\"]"));
			saveall.click();  
			
		
			
		} 
		public static void post() { 
			
			WebElement post= driver.findElement(By.xpath("//span[text()='Post']"));
			post.click(); 
		
			
			WebElement iframepost= driver.findElement(By.xpath("//iframe[@class=\"cke_wysiwyg_frame cke_reset\"]"));
			driver.switchTo().frame(iframepost); 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement entertext= driver.findElement(By.xpath("//body[@class='hasMotif userTab  UserProfilePage  ext-webkit ext-chrome sfdcBody brandQuaternaryBgr']"));
			entertext.sendKeys("Hello");
			
			WebElement share = driver.findElement(By.xpath("//input[@id=\"publishersharebutton\"]"));
			share.click();
			
		} 
			public static void filelink() {
				WebElement file = driver.findElement(By.xpath("//span[text()='File']"));
				file.click(); 
				WebElement complink = driver.findElement(By.id("chatterUploadFileAction"));
				complink.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement choosefile = driver.findElement(By.id("chatterFile"));
				choosefile.click();
			}
}
