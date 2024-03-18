package com.cydeo.tests.day03_cSSselector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_HMW2_Zerobank_Xpath_Css {

    public static void main(String[] args) {
      //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriver driver=WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        //WebElement headerText= driver.findElement(By.xpath("//h3"));   //by Xpath

        WebElement headerText= driver.findElement(By.cssSelector("h3"));
        String expectedHeaderTitleZeroBank="Log in to ZeroBank";
        String actualHeaderTitleZeroBank=headerText.getText();
        if(actualHeaderTitleZeroBank.equalsIgnoreCase(expectedHeaderTitleZeroBank)){
            System.out.println("Login in to ZeroBank header Text is Passed");
        }else{
            System.out.println("Login in to ZeroBank header Text is Failed");
        }

    }
}
