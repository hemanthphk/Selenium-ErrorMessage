package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetErrorMessage {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement name=driver.findElement(By.xpath("//span[contains(text(),'Enter first name and surname')]"));
	    String text=name.getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
	}

}
