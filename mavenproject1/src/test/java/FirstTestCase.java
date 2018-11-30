/*
 * Copyright (c) 2018 santo.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author santo
 */
public class FirstTestCase {
    WebDriver driver;
    WebElement element;
    public FirstTestCase() {
    }

    @Test
    public void main() {
        element = driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]"));
        element.sendKeys("apple");
        element.submit();
}
    @BeforeMethod
    public void setUpMethod() throws Exception {
        driver = new FirefoxDriver();
        String URL = "https://www.google.com.np";
        driver.get(URL);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
}
