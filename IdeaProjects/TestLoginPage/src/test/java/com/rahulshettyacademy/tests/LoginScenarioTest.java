package com.rahulshettyacademy.tests;

import com.rahulshettyacademy.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginScenarioTest {

    public static WebDriver driver;

    @BeforeMethod
    public void UrlAccess(){
        driver=new ChromeDriver();
        driver.get("https://www.google.com/intl/en-US/gmail/about/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void getData(){
        LoginPage.setFullData(driver,"Sai","Ram@gmail.com");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
