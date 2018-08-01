package com.cg.login.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver = null;
	
	@Given("^The login page is opened$")
	public void the_login_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\vaishnav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("D:\\BDD\\LoginPageValidateJavaScriptAlert\\src\\com\\cg\\login\\bean\\LoginForm.html");
	}

	@When("^The user enters valid user name \"([^\"]*)\"$")
	public void the_user_enters_valid_user_name(String arg1) throws Throwable {

		WebElement username = driver.findElement(By.id("name"));
		username.sendKeys(arg1);
	}

	@When("^The user enters corresponding valid user's password \"([^\"]*)\"$")
	public void the_user_enters_corresponding_valid_user_s_password(String arg1) throws Throwable {

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(arg1);
	
	}

	@When("^The submit button is clicked$")
	public void the_submit_button_is_clicked() throws Throwable {

		WebElement submit = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/input"));
		submit.click();
	}

	@Then("^User can login successfully$")
	public void user_can_login_successfully() throws Throwable {
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		assertEquals("Successfully logged in",alert.getText());
	}
	
	
	@When("^The user does not enter corresponding valid user's password \"([^\"]*)\"$")
	public void the_user_does_not_enter_corresponding_valid_user_s_password(String arg1) throws Throwable {

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(arg1);
	}

	@Then("^User login failed$")
	public void user_login_failed() throws Throwable {
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		assertEquals("Login Failed as password is incorrect",alert.getText());
	}

	@When("^The user does not enter valid user name \"([^\"]*)\"$")
	public void the_user_does_not_enter_valid_user_name(String arg1) throws Throwable {

		WebElement username = driver.findElement(By.id("name"));
		username.sendKeys(arg1);
	}

	@Then("^User login failed complelely$")
	public void user_login_failed_complelely() throws Throwable {
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		assertEquals("Login Failed as username and password is incorrect",alert.getText());
	}

}
