package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
        //3- Verify header text is as expected:
        //Expected: Registration form
        WebElement header=driver.findElement(By.tagName("h2")); //WE LOCATE IT FIRST

        String expectedText="Registration form";
        String actualText=header.getText();
        if(actualText.equals(expectedText)){
            System.out.println("Header text verification Passed");
        }else{
            System.out.println("Header text verification Failed");

        }
        //4- Locate “First name” input box
        WebElement firstTimeElement= driver.findElement(By.className("form-control")); //   We locate it
        //5- Verify placeholder attribute’s value is as expected://
        //Expected: first name
          String expectedValue="first name";
          String actualValue=firstTimeElement.getAttribute("placeholder");
        System.out.println("actualValue = " + actualValue);//

        if(actualValue.equals(expectedValue)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }



    }
}
