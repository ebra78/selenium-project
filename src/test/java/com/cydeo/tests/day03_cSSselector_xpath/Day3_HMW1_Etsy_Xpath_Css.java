package com.cydeo.tests.day03_cSSselector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_HMW1_Etsy_Xpath_Css {

    public static void main(String[] args) {
        //HWP #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");


        //3. Search for “wooden spoon”
        //by Css
        //WebElement woodenSpoon= driver.findElement(By.cssSelector("input#global-enhancements-search-query"));
        WebElement woodenSpoon= driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));

        //by xpath
        //WebElement woodenSpoon= driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
        //WebElement woodenSpoon= driver.findElement(By.xpath("//input[@data-id='search-query']"));
        // //input[@placeholder='Search for anything']
        // WebElement woodenSpoon= driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
         woodenSpoon.sendKeys("wooden spoon"+ Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon - Etsy”
          String expectedWoodenSpoonTitle="Wooden spoon - Etsy";
          String actualWoodenSpoonTitle=driver.getTitle();
          if(actualWoodenSpoonTitle.equals(expectedWoodenSpoonTitle)){
              System.out.println("Wooden Spoon Title Is Passed");
          }else{
              System.out.println("Wooden Spoon Title Is Failed");
        }



    }
}
