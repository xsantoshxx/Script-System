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
//    Launch new Browser
//    Open URL http://toolsqa.wpengine.com/automation-practice-form/
//    Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
//    Identify Submit button with ‘tagName’, convert it in to string and print it on the console
//    Click on the Link “Link Test” (Use ‘linkTest’ locator)

public class FindElementCommandExercise2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        String URL  = "http://toolsqa.wpengine.com/automation-practice-form/";
        driver.get(URL);
        driver.findElement(By.partialLinkText("Partial")).click();
        System.out.println("Partial linked clicked");
        String tagName = driver.findElement(By.tagName("button")).toString();
        System.out.println(tagName);
        driver.findElement(By.linkText("Link Test")).click();
        System.out.println("Linked clicked");
        
    }
}
