/*
 * Copyright (c) 2018 santo.
 */
package com.seleniumtest.mavenproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author santo
 */
public class WriteInExcel {
    private static XSSFWorkbook ExcelWBook =  new XSSFWorkbook();
    public static XSSFSheet ExcelWSheet = ExcelWBook.createSheet("Sheet1");
    private static XSSFCell Cell;
    private static XSSFRow Row;
    
    public static void setCellData(String Result,int RowNum,int ColNum) throws Exception{
        try{
            Row = ExcelWSheet.createRow(RowNum);
            Cell = Row.createCell(ColNum);
            Cell.setCellValue(Result);
 
            FileOutputStream fileOut = new FileOutputStream(Constants.Path_TestData+Constants.File_TestData);
            ExcelWBook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        }catch(Exception e){
            throw(e);
        }
    }
    public static void main(String [] args) throws Exception{
        WebDriver driver = new FirefoxDriver();
        String URL = "https://www.unitedstateszipcodes.org/";
        driver.get(URL);
        
        WebElement element = driver.findElement(By.xpath("//a[contains(.,'10013')]"));
        String value = element.getText();
        try{
            WriteInExcel.setCellData(value, 1, 1);

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(value + " Outside Try");
        
        
        
        
    }
}
