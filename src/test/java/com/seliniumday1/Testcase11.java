package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase11 extends Testcase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		Accountview();
	}
	public static void Accountview() {
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
		WebElement newview = driver.findElement(By.xpath("//a[text()='Create New View']"));
		newview.click();
		WebElement name = driver.findElement(By.id("fname"));
		name.sendKeys("sam");
		WebElement unique = driver.findElement(By.id("devname"));
		unique.sendKeys("sam");
		WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
	}
}
