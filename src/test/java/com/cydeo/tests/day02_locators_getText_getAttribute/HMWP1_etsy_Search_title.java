package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMWP1_etsy_Search_title {
    public static void main(String[] args) {
        //HWP #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));

        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
        //4.
        //Expected: “Wooden spoon - Etsy”
        String  expectedTitle="Wooden spoon - Etsy";
        String actualTitle=driver.getTitle();
        //Create a simple if condition to compare actual and expected
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title test Passed");
        }else{
            System.out.println("Title test Failed");
        }

         driver.close();





    }
}
