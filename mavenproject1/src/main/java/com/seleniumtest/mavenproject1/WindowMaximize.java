/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author santo
 */
public class WindowMaximize {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        String URL = "https://www.google.com.np";
        driver.get(URL);
        
//        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]"));
        
        element.sendKeys("apple");
        
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        
        element.submit();
        
        
        
    }
}
