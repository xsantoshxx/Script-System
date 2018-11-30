/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

/**
 *
 * @author santo
 */
public class FluentWaitCommand {
    public static void main(String [] args) throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
        driver.get(URL);
        
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250,TimeUnit.MILLISECONDS);
        wait.withTimeout(2,TimeUnit.MINUTES);
        wait.ignoring(NoSuchElementException.class);
        
        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>(){
            public Boolean apply(WebDriver args0){
                WebElement element = args0.findElement(By.id("colorVar"));
                String color = element.getAttribute("color");
                System.out.println(color);
                if(color.equalsIgnoreCase("red")){
                    return true;
                }
                return false;
            }
        };
        wait.until(function);
    }
}
