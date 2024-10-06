package com.rahulshettyacademy.tests;

import com.rahulshettyacademy.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignInScenarioTest {

    public static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void verifyValidCredentials(){
        //Test case 1 : Enter valid username and password.
       SignInPage.userSignInFlow(driver,"Rahul","rahulshettyacademy");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
