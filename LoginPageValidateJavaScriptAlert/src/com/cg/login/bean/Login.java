package com.cg.login.bean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\Users\\vaishnav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("D:\\BDD\\LoginPageValidateJavaScriptAlert\\src\\com\\cg\\login\\bean\\LoginForm.html");
	
	WebElement name = driver.findElement(By.id("name"));
	name.sendKeys("vaishnavi");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("vaishu");
	
	WebElement submit = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/input"));
	submit.click();
	
	}
}
