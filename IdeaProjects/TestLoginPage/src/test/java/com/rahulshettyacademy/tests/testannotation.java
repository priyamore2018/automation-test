package com.rahulshettyacademy.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testannotation
{
    @BeforeMethod
    public void display()
    {
        System.out.println("BeforeMethod");
    }

    @Test
    public void setnumber()
    {
        System.out.println("Test case1");
    }
    @Test
    public void setnumber1()
    {
        System.out.println("Test case2");
    }

    @AfterMethod
    public void afterdisplay()
    {
        System.out.println("AfterMethod");
    }
}
