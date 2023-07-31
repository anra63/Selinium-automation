package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testcase10 extends Testcase9 {

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement New = driver.findElement(By.xpath("//input[@title='New']"));
		New.click(); 
		WebElement accountname = driver.findElement(By.id("acc2"));
		accountname.sendKeys("Dan");
		WebElement type = driver.findElement(By.id("acc6"));
		Select dropdown = new Select(type);
		dropdown.selectByVisibleText("Technology Partner");
		 
		WebElement priority = driver.findElement(By.id("00NHu00000NHVRQ"));
		Select dropdown1 = new Select(priority);
		dropdown1.selectByVisibleText("High");
		 
		
		
	}
}
