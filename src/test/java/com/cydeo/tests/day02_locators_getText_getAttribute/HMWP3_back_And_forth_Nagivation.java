package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMWP3_back_And_forth_Nagivation {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a Chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gMailLink=driver.findElement(By.linkText("Gmail"));
        gMailLink.click();
        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitle="Gmail";
        String actualTitle= driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification Passed ");
        }else{
            System.out.println("Title Verification Failed ");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Google
          String expectedTitle1="Google";
          String actualTitle1= driver.getTitle();
         if(actualTitle.equals(expectedTitle)){
             System.out.println("Google Title Passed");
         }else {
             System.out.println("Google Title Failed ");
         }


    }

}
