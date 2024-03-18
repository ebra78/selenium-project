package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMW4_cydeo_Class_locater {
    public static void main(String[] args) {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a Chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        //3- Click to “Home” link
       // WebElement link= driver.findElement(By.linkText("Home"));
         WebElement linkHome= driver.findElement(By.className("nav-link"));
        linkHome.click();
        //4- Verify title is as expected:
        //Expected: Practice
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed");

        }else {
            System.out.println("Failed");
        }
        //PS: Locate “Home” link using “className” locator



    }
}
