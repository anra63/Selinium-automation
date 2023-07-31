package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase13 extends Testcase12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		editview();
	}
	public static void editview() {
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
		
		WebElement view = driver.findElement(By.id("fcf"));
		view.click();
		WebElement edit = driver.findElement(By.xpath("//a[text()='Edit']"));
		edit.click();
		WebElement viewname = driver.findElement(By.id("fname"));
		viewname.sendKeys("dan");
		WebElement column = driver.findElement(By.id("fcol1"));
		Select select = new Select(column);
		select.selectByVisibleText("Account Name");
		WebElement operator = driver.findElement(By.id("fop1"));
		Select select1 = new Select(operator);
		select1.selectByVisibleText("contains");
		WebElement value = driver.findElement(By.id("fval1"));
		value.sendKeys("a");
		WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
		save.sendKeys("a");
		
		
	}
}



