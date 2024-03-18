package com.cydeo.tests.day03_cSSselector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_expath {

    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        String expectedText="Log In";


        //Locating loginButton using xpath using type attribute's value                                                 //tagname=[@attribute='value']
        //WebElement logInButton= driver.findElement(By.xpath("//input[@type='submit']"));

        //Locating loginButton using xpath using value attribute's value
        //WebElement logInButton= driver.findElement(By.xpath("//input[@value='Log In']"));

        //Locating loginButton using xpath using class attribute's value
        WebElement logInButton= driver.findElement(By.xpath("//input[@class='login-btn']"));
        String actuallLoginText=logInButton.getAttribute("value");//return me Log In

        if (actuallLoginText.equals(expectedText)){
            System.out.println("Login verification Passed");
        }else {
            System.out.println("Login verification Failed");
        }
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from





    }
}
