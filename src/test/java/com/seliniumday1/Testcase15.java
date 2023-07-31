package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase15 extends Testcase14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		opportunity();
		oppview();
	}
	public static void opportunity() {
		WebElement opportunity = driver.findElement(By.xpath("//a[@title=\"Opportunities Tab\"]"));
		opportunity.click();
	} 
	public static void oppview() {
//		WebElement alert = driver.findElement(By.xpath("onunload=\"if(this.bodyOnUnload)bodyOnUnload();\""));
//		alert.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		WebElement view = driver.findElement(By.xpath("//select[@id='fcf']"));
		view.click(); 
	}
}
