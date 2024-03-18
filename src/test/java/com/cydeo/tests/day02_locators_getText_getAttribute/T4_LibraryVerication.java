package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerication {

    public static void main(String[] args) {

        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://library2.cybertekschool.com/login.html
         driver.get("https://library2.cybertekschool.com/login.html");
        //3. Enter username: “incorrect@email.com”
        WebElement usernameInput=driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        WebElement password= driver.findElement(By.id("inputPassword"));
        password.sendKeys( "empty");
        //5.Locate Sign in button using = tag name locator
        WebElement VerifyPassword=driver.findElement(By.tagName("button"));//tag name yani tagin adi =button name sitede
         VerifyPassword.click();

         //Verify: visually "Sorry, Wrong Email or Password" displayed
          //VERIFIED!!


        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locator


        //NOT:

        //


    }
}
