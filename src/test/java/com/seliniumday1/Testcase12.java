package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase12 extends Testcase11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		merge();
	}
	public static void merge() {
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
		WebElement maccount = driver.findElement(By.xpath("//a[text()='Merge Accounts']"));
		maccount.click();
		WebElement search = driver.findElement(By.id("srch"));
		search.sendKeys("Anup ABCD");
		WebElement find = driver.findElement(By.xpath("//input[@type='submit'][@value='Find Accounts']"));
		find.click();
		WebElement next = driver.findElement(By.xpath("//input[@title='Next']"));
		next.click();
		WebElement merge = driver.findElement(By.xpath("//input[@title='Merge']"));
		merge.click();
	}
}
