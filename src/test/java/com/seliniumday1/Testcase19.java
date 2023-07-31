package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase19 extends Testcase18{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		opportunity();
		qsummery();
	}
	public static void qsummery() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement interval = driver.findElement(By.id("quarter_q"));
		interval.click();
		Select select = new Select(interval);
		select.selectByIndex(2);
		
		WebElement include = driver.findElement(By.id("open"));
		include.click();
		Select select1 = new Select(interval);
		select1.selectByIndex(0);
		WebElement run = driver.findElement(By.xpath("//input[@title='Run Report']"));
		run.click();
		
		
		
	}
}
