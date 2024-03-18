package com.cydeo.tests.day03_cSSselector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class T1_locators_getText {

    public static void main(String[] args) {


        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Enter incorrect username: “incorrect”
        WebElement incorrectUsername= driver.findElement(By.name("USER_LOGIN"));
        incorrectUsername.sendKeys("incorrect");
        //4- Enter incorrect password: “incorrect”
        WebElement password= driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");
        //5- Click to login button.
        WebElement login= driver.findElement(By.className("login-btn"));
        login.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        String expectedErrorMessage="Incorrect login or password";
        String actualMessage=driver.findElement(By.className("errortext")).getText();

        if(actualMessage.equals(expectedErrorMessage)){
            System.out.println("Error message Passed");
        }else {
            System.out.println("Error message Failed");
        }




        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
