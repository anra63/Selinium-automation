package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase14 extends Testcase13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		Accounts();
	}
	public static void Accounts() {
		WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
		accounts.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement alert = driver.findElement(By.xpath("//body[@onunload=\"if(this.bodyOnUnload)bodyOnUnload();\"]"));
		alert.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-enerated catch block
			e.printStackTrace();
		} 
		
		WebElement report = driver.findElement(By.xpath("//a[text()='Accounts with last activity > 30 days']"));
		report.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement datefield = driver.findElement(By.id("ext-gen148"));
		datefield.click();
		Select select = new Select(datefield);
		select.selectByVisibleText("Created Date");
		WebElement cal = driver.findElement(By.id("ext-gen152"));
		cal.click();	
		WebElement datefrom = driver.findElement(By.id("ext-gen281"));
		datefrom.click();	
		
	}
}
