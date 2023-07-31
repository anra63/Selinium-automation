package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase16 extends Testcase15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		opportunity();
		newlink();
	}
	public static void newlink() {
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		WebElement alert = driver.findElement(By.xpath("//body[@onunload=\"if(this.bodyOnUnload)bodyOnUnload();\"]"));
//		alert.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		WebElement newl = driver.findElement(By.xpath("//input[@title='New'][@type='button']"));
		newl.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		WebElement oppname = driver.findElement(By.id("opp3"));
		oppname.sendKeys("mala");
		WebElement accname = driver.findElement(By.id("opp4"));
		accname.sendKeys("mala");
		WebElement stage = driver.findElement(By.id("opp11"));
		stage.click();
		Select select = new Select(stage);
		select.selectByVisibleText("Prospecting");
		WebElement probability = driver.findElement(By.id("opp12"));
		probability.sendKeys("0");
		WebElement ls = driver.findElement(By.id("opp6"));
		ls.click();
		Select select1 = new Select(ls);
		select1.selectByIndex(2);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement date = driver.findElement(By.xpath("//a[@class='calToday']"));
		date.click();
		WebElement save = driver.findElement(By.xpath("//input[@name='save']"));
		save.click();
		
		
}
}