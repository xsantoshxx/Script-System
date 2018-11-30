/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import java.util.List;
import javax.swing.text.html.HTML;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author santo
 */

//    Launch new Browser
//    Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
//    Get the value from cell ‘Dubai’ with using dynamic xpath
//    Print all the column values of row ‘Clock Tower Hotel’

public class HandlingDynamicWebTableExercise2 {
    public static void main(String[] args){
        try{
            WebDriver driver = new FirefoxDriver();
            String URL = "http://toolsqa.wpengine.com/automation-practice-table/";
            driver.get(URL);
            
            int colValue = 2;
            int rowValue = 1;
            String sValue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+rowValue+"]/td["+colValue+"]")).getText();
            System.out.println(sValue);
            
            String sColValue = "Clock Tower Hotel";
                            List<WebElement> rows = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));
                            for(WebElement row:rows ){
                                String test1 = row.findElement(By.tagName("th")).getText();
                                System.out.println(test1);
                                
                                if(row.findElement(By.tagName("th")).getText().equalsIgnoreCase(sColValue)){
                                    List<WebElement> cols = row.findElements(By.cssSelector("td"));
                                    for(WebElement col:cols){
                                        String value2 = col.getText();
                                        System.out.println(value2);
                                    }
                                }
                            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
