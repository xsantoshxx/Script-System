/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author santo
 */
//    Launch new Browser
//    Open “http://toolsqa.wpengine.com/automation-practice-form/“
//    Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
//    Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
//    Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
//    Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)

public class CheckboxRadioButtonOperation {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        
        //List oRadioButton = driver.findElements(By.name("sex"));
        List<WebElement> oRadioButton = driver.findElements(By.name("sex"));
        boolean bValue = false;
        oRadioButton.get(0).click();
        bValue = oRadioButton.get(0).isSelected();
        if(bValue == true){
            oRadioButton.get(1).click();
        }
        else{
            oRadioButton.get(0).click();
        }
        
        driver.findElement(By.id("exp-2")).click();
        
        List<WebElement> oCheckBox = driver.findElements(By.name("profession"));
        
        int isize = oCheckBox.size();
        
        for(int i = 0; i<isize; i++){
            String value = oCheckBox.get(i).getAttribute("value");
            if(value.equalsIgnoreCase("Automation Tester")){
                oCheckBox.get(i).click();
                break;
            }
        }
        WebElement toolCheckBox = driver.findElement(By.cssSelector("input[value = 'Selenium IDE']"));
        toolCheckBox.click();
        
        
    }
}
