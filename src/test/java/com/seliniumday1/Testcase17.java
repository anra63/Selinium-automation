package com.seliniumday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase17 extends Testcase15{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		opportunity();
		pipeline();

}
	public static void pipeline() { 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement piplink = driver.findElement(By.xpath("//a[@href='/00O?rt=22&retURL=%2F006%2Fo&open=open&break0=STAGE_NAME&t=title5&c=RD&c=FN&c=AN&c=ON&c=SN&c=FQ&c=PB&c=AG&c=CD&c=CR&c=NS&c=LS&c=TY&s=AM&s=EA&a=AG&details=yes&format=t']"));
		piplink.click();
	}
}
