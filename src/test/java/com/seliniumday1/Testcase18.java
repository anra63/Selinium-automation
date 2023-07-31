package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase18 extends Testcase17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		opportunity();
		stuckopplink();
	}
	public static void stuckopplink() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement stuckopp = driver.findElement(By.xpath("//a[@href='/00O?rt=22&retURL=%2F006%2Fo&open=open&break0=STAGE_NAME&sort=STAGE_DURATION&sortdir=down&t=title7&c=FN&c=AN&c=ON&c=SN&c=FQ&c=PB&c=CD&c=TY&s=AM&a=AG&a=SD&details=yes&format=t']"));
		stuckopp.click();
		
	}
}
