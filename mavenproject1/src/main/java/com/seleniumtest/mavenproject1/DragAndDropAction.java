package com.seleniumtest.mavenproject1;

/*
 * Copyright (c) 2018 santo.
 */

/**
 *
 * @author santo
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropAction {
    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new FirefoxDriver();

    String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";

    driver.get(URL);

// It is always advisable to Maximize the window before performing DragNDrop action

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

//WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

WebElement To = driver.findElement(By.xpath("//span[@class = 'selectedTreeRow'][contains(.,'Bestsellers')]"));
driver.findElement(By.xpath("(//div[contains(@class,'dhx_bg_img_fix')])[10]")).click();
Actions builder = new Actions(driver);

Action dragAndDrop = builder.clickAndHold(From)

.moveToElement(To)

.release(To)

.build();

dragAndDrop.perform();

}

}
