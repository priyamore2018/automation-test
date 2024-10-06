package com.rahulshettyacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

 public static WebElement element;

 public static void enterUserName(WebDriver driver, String userName){
  element= driver.findElement(By.id("inputUsername"));
  element.sendKeys(userName);
 }
 public static void enterPassword(WebDriver driver,String userPassword){
  element=driver.findElement(By.name("inputPassword"));
  element.sendKeys(userPassword);
 }

 public static void clickSignInBtn(WebDriver driver){
  element=driver.findElement(By.className("signInBtn"));
  element.click();
 }

 public static void userSignInFlow(WebDriver driver,String userName, String userPassword){
  enterUserName(driver,userName);
  enterPassword(driver,userPassword);
  clickSignInBtn(driver);

 }


}
