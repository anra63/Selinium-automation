package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase9 extends Testcase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		usermenu();
		logout();
	}
	public static void logout() {
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click(); 
	}
}
