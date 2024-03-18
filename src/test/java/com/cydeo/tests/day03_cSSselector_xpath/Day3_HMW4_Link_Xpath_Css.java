package com.cydeo.tests.day03_cSSselector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_HMW4_Link_Xpath_Css {

    public static void main(String[] args) {
         //HWP #4: Practice Cydeo – xpath locator practice
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        //WebElement HomeLinkButton= driver.findElement(By.xpath("//a[@class='nav-link']"));
       // WebElement HomeLinkButton=driver.findElement(By.xpath("//a[@href='/']"));
        WebElement HomeLinkButton=driver.findElement(By.xpath("//a[text()='Home']"));
        //4- Verify title is as expected:
        //Expected: Practice
        String ExpectedTitle="Practice";
        String CurrentTitle= driver.getTitle();
        HomeLinkButton.click();

        //PS: Locate “Home” link using “xpath” locator
    }
}
