/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author santo
 */
//
//    Launch new Browser
//    Open URL http://toolsqa.wpengine.com/automation-practice-form/
//    Type Name & Last Name (Use Name locator)
//    Click on Submit button (Use ID locator)

public class FindElementCommandExercise1 {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        driver.findElement(By.name("firstname")).sendKeys("Santosh");
        driver.findElement(By.name("lastname")).sendKeys("Maharjan");
        driver.findElement(By.id("submit")).click();
        
        
    }
    
}
