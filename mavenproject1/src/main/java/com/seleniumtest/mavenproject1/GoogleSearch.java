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
public class GoogleSearch {
    public static void main(String[] args){
        try{
            WebDriver driver = new FirefoxDriver();
        String URL = "https://www.google.com/";
        driver.get(URL);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Apple"+"/n");
        
//        driver.findElement(By.xpath("//*[@id='gb_70']")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content")).click();
//        
//        driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("9843165374");
//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content")).click();
        //Scanner scanner = new Scanner(System.in);

        //driver.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
