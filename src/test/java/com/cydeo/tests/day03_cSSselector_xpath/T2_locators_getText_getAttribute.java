package com.cydeo.tests.day03_cSSselector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locators_getText_getAttribute {
    public static void main(String[] args) {


        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        String expectedLabel = "Remember me on this computer";
        String actualLabel = driver.findElement(By.className("login-item-checkbox-label")).getText();
        if (actualLabel.equalsIgnoreCase(expectedLabel)) {
            System.out.println("Label text  Passed");

        } else {
            System.out.println("Label text Failed");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        String expectedPasswordText = "Forgot your password?";
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualPasswordText = forgotPasswordLink.getText();


        if (actualPasswordText.equalsIgnoreCase(expectedPasswordText)) {
            System.out.println("Password verification Passed");
        } else {
            System.out.println("Password verification Failed");

        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedInHref = "forgot_password=yes";
        String actualHrefValue = forgotPasswordLink.getAttribute("href");


        if (actualHrefValue.contains(expectedInHref)) {
            System.out.println("Password Passed");
        } else {
            System.out.println("Password Failed");
           // System.out.println("actualHrefValue" + actualHrefValue);  eger failed cikarsa nerde hata yaptigini anlamak icin
            //System.out.println("expectedInHref" + expectedInHref);


        }
    }
}



