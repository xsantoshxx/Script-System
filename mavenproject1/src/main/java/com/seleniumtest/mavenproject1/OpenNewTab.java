/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 *
 * @author santo
 */
public class OpenNewTab {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        if (driver instanceof JavascriptExecutor) {
        ((JavascriptExecutor)driver).executeScript("window.open();");
        }
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.facebook.com");
        
    }
    
}
