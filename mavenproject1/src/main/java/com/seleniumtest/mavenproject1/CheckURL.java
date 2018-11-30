/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author santo
 */
public class CheckURL {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        String URL = "www.google.com";
        driver.get(URL);
        driver.navigate().back();
        WebElement element = driver.findElement(By.id("name"));
        WebElement elementName = driver.findElement(By.name("firstname"));
        WebElement parentElement = driver.findElement(By.className("button"));
        WebElement childElement = parentElement.findElement(By.id("submit"));
        
    }
    
}
