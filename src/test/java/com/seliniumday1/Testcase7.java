package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase7 extends Testcase6 {
	
	public static void main(String[] args) {
		
		launch();
		usermenu();
		mysetting();
		personal();
		calender();
	}
	public static void usermenu() {
	
	WebElement userbutton = driver.findElement(By.xpath("//span[contains(text(),'Anup ABCD')]"));
	userbutton.click(); 
	} 
	public static void mysetting() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement mysetting = driver.findElement(By.xpath("//a[text()='My Settings']"));
		mysetting.click();
		}
	
	public static void personal() {
		
		WebElement personal= driver.findElement(By.xpath("//span[text()='Personal']"));
		personal.click(); 
		
		WebElement loginhist= driver.findElement(By.id("LoginHistory_font"));
		loginhist.click(); 
		
		WebElement disandlay= driver.findElement(By.id("DisplayAndLayout_font"));
		disandlay.click(); 
		WebElement custmytab= driver.findElement(By.id("CustomizeTabs_font"));
		custmytab.click(); 
		
		WebElement custapp= driver.findElement(By.id("p4"));
		custapp.click(); 
		Select customappdrop = new Select(custapp);
		customappdrop.selectByVisibleText("Salesforce Chatter");
		
		WebElement report= driver.findElement(By.xpath("//option[text()='Reports']"));
		report.click(); 
		WebElement repadd= driver.findElement(By.xpath("//img[@title='Add']"));
		repadd.click(); 
		WebElement save= driver.findElement(By.xpath("//input[@title='Save']"));
		save.click(); 
		WebElement email= driver.findElement(By.id("EmailSetup_font"));
		email.click(); 
		
		WebElement emaillink= driver.findElement(By.id("EmailSettings_font"));
		emaillink.click(); 
		
		WebElement emailname= driver.findElement(By.id("sender_name"));
		emailname.sendKeys("Sam32");
		WebElement save1= driver.findElement(By.id("sender_name"));
		save1.click(); 
	
	}
	
	public static void calender() {
		WebElement cal= driver.findElement(By.id("CalendarAndReminders_font"));
		cal.click(); 
		WebElement calrem= driver.findElement(By.id("Reminders_font"));
		calrem.click(); 
		WebElement opentextrem= driver.findElement(By.id("testbtn"));
		opentextrem.click(); 
	}
}
