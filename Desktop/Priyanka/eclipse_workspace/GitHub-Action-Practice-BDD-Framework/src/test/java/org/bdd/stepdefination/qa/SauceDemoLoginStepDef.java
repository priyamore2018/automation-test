package org.bdd.stepdefination.qa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLoginStepDef {
	
	WebDriver driver;
	
	@Given("user Login to saucedemo Page")
	public void user_login_to_saucedemo_page() {
		driver=new ChromeDriver();
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();

	}

	@When("Enter Username and Password")
	public void enter_username_and_password() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
	 
	}

	@Then("user will navigate to product page")
	public void user_will_navigate_to_product_page() throws InterruptedException {
		
		WebElement text=driver.findElement(By.xpath("//span[text()=\"Products\"]"));
		String actualText= text.getText();
	 assertEquals(actualText, "Products","Not Land on product page ");
	 Thread.sleep(4000);
	 driver.quit();
	}



}
