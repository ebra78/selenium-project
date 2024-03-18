package com.cydeo.tests.day03_cSSselector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_HMW3_Google_Xpath_Css {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();


        //2- Go to: https://google.com
        driver.get("https://google.com");


        //3- Click to Gmail from top right.
        //WebElement gmailButton= driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']"));
        WebElement gmailButton= driver.findElement(By.xpath("//a[text()='Gmail']")); //text()method without@

       // WebElement gmailButton= driver.findElements(By.cssSelector("a.gb_H"));
        gmailButton.click();
        //4- Verify title contains:
        //Expected: Gmail
        String gmailExpectedTitle="Gmail";
        String gmailActualTitle=driver.getTitle();
        System.out.println("gmailActualTitle = " + gmailActualTitle);//to check it to be sure!
        if(gmailActualTitle.equals(gmailExpectedTitle)){
           System.out.println("Gmail title Passed");
        }else{
            System.out.println("Gmail title Failed");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        String expectedTitleGoogle="Google";
        String actualTitleGoogle=driver.getTitle();

        if(actualTitleGoogle.equals(expectedTitleGoogle)){
            System.out.println("Google title Passed");
        }else {
            System.out.println("Google title Passed");
        }

         driver.close();

    }
}
