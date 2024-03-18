package com.cydeo.tests.review.day1_2_3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_PracticePageLogin {

    public static void main(String[] args) {

        // TC#2: Practice page Login test

        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

        // 3. Enter username: "tomsmith"
         WebElement userName= driver.findElement(By.xpath("// input[@type='text'])"));
         userName.click();
         // 4. Enter password: "SuperSecretPassword"
        userName.sendKeys("tomsmith");
        // 5. Click to Login button
        //WebElement loginButton= driver.findElement(By.xpath(//button[text()='Login'] ));
                WebElement loginButton= driver.findElement(By.xpath( "//button[@id='wooden_spoon']"));


        // 6. Verify text displayed on page
        //    Expected: "You logged into a secure area!"'
        String expectedVerifyText="You logged into a secure area!";
        String actualVerifyText= loginButton.getText();
        if(actualVerifyText.equals("You logged into a secure area!")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


    }
}
