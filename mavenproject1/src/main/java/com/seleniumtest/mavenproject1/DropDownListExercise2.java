/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author santo
 */

//    Launch new Browser
//    Open “http://toolsqa.wpengine.com/automation-practice-form/”
//    Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
//    Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
//    Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
//    Print and select all the options for the selected Multiple selection list.
//    Deselect all options
//    Close the browser

public class DropDownListExercise2 {
    public static void main(String[] args){
        try{
        WebDriver driver = new FirefoxDriver();
        String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
        driver.get(URL);
        
        WebElement element = driver.findElement(By.name("selenium_commands"));
        
        Select oSelect = new Select(element);
        oSelect.selectByIndex(0);
        Thread.sleep(1000);
        oSelect.deselectByIndex(0);
        
        oSelect.selectByVisibleText("Navigation Commands");
        Thread.sleep(1000);
        oSelect.deselectByVisibleText("Navigation Commands");
        
        List<WebElement> oList = oSelect.getOptions();
        
        int oSize = oList.size();
        for(int i=0; i<oSize; i++){
            String value = oList.get(i).getText();
            System.out.println(value);
            oSelect.selectByIndex(i);
            Thread.sleep(1000);
            oSelect.deselectAll();
        }
        driver.quit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


























