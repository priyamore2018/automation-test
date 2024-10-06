package com.rahulshettyacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static WebElement element;

    public static void setUsername(WebDriver driver,String userName)
    {
        element=driver.findElement(By.className(".form-control.ng-pristine.ng-invalid.ng-touched"));
        element.sendKeys(userName);
    }
    public static void setEmail(WebDriver driver,String userEmail)
    {
        element=driver.findElement(By.className("input[name='email']"));
        element.sendKeys(userEmail);
    }
    public static void submitForm(WebDriver driver){
        //  //input[@class='btn btn-success']
        element=driver.findElement(By.xpath("//input[@class='btn btn-success']"));
        element.click();
    }

    public static void setFullData(WebDriver driver,String username, String userEmail){
         setUsername(driver,username);
         setEmail(driver,userEmail);
         submitForm(driver);

    }
}
