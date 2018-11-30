/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author santo
 */
//    Launch new Browser
//    Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
//    Get the value from cell ‘Dubai’ and print it on the console
//    Click on the link ‘Detail’ of the first row and last column
public class HandlingDynamicWebTableExercise1 {
    public static void main(String [] args){
        try{
            WebDriver driver = new FirefoxDriver();
            String URL = "http://toolsqa.wpengine.com/automation-practice-table/";
            driver.get(URL);
            
            String sValue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
            System.out.println(sValue);
                      
            driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]")).click();
           
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
