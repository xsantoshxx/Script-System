/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import static java.util.concurrent.TimeUnit.SECONDS;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author santo
 */
////Launch new Browser
////
////2) Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
////
////3) Click on the Button “Timing Alert”
////
//  4) Accept the Alert (Alert will take 3 second to get displayed, Use WebDriverWait to wait for it)

public class WaitWebDriverCommandExercise1 {
    public static WebDriver driver;
    public static void main(String []args){
        
        driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(10,SECONDS);
        
        String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
        
        driver.get(URL);
        
        driver.findElement(By.id("timingAlert")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        
        alert.accept();
        
    }
}
