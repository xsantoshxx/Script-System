package com.seleniumtest.mavenproject1;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Copyright (c) 2018 santo.
 */

/**
 *
 * @author santo
 */
//    Launch new Browser
//    Open “http://toolsqa.wpengine.com/automation-practice-form/”
//    Select ‘Continents’ Drop down ( Use Id to identify the element )
//    Select option ‘Europe’ (Use selectByIndex)
//    Select option ‘Africa’ now (Use selectByVisibleText)
//    Print all the options for the selected drop down and select one option of your choice
//    Close the browser

public class DropDownListExercise1 {
    public static void main(String[] args){
        try{
        WebDriver driver = new FirefoxDriver();
        String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
        driver.get(URL);
        
        WebElement element = driver.findElement(By.id("continents"));
        
        Select oSelect = new Select(element);
        oSelect.selectByIndex(1);
        Thread.sleep(1000);
        oSelect.selectByVisibleText("Africa");
        
        List<WebElement> optionCount = oSelect.getOptions();
        int dSize = optionCount.size();
        
        for(int i = 0; i<dSize; i++){
            String value = optionCount.get(i).getText();
            System.out.println(value);
            
            if(value.equals("Asia")){
                oSelect.selectByIndex(i);
                break;
            }
        }
        driver.quit();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
