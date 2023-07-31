package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase8 extends Testcase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		usermenu();
		devconsole();
	}
	public static void devconsole() {
		WebElement devlopercon = driver.findElement(By.xpath("//a[text()='Developer Console']"));
		devlopercon.click(); 
		
		String parentwindow = driver.getWindowHandle();
		for(String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		driver.close();
		driver.switchTo().window(parentwindow);
	}
}
