package com.rahulshettyacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Seleniumex {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.qonto.com/signin");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        WebElement element;
        driver.findElement(By.id("f5677a07-7d61-4c60-8537-1158810bb5bc")).sendKeys("abc");
        //element.sendKeys("Priyanka");

    }
}
