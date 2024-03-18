package com.cydeo.tests.day04_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Xpath_cssSelector_Practices {

    public static void main(String[] args) {
        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver =WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link          //a[@class='nav-link']    //a[text()='Home']   a[class='nav-link'] a[href="/"]
       // WebElement homeButton= driver.findElement(By.xpath("//a[@class='nav-link']"));
       // WebElement homeButton= driver.findElement(By.xpath("//a[text()='Home']"));
        //WebElement homeButton= driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeButton= driver.findElement(By.cssSelector("a[href='/']"));
        //b. “Forgot password” header
       // WebElement forgotPasswordHeader= driver.findElement(By.cssSelector("div[class='example']>h2"));
       // WebElement forgotPasswordHeader= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement forgotPasswordHeader= driver.findElement(By.cssSelector("div.example>h2"));
        //c. “E-mail” text
       // WebElement e_mailText= driver.findElement(By.cssSelector("div.example>h2"));
        //WebElement e_mailText= driver.findElement(By.cssSelector("label[for='email']"));
         WebElement e_mailText= driver.findElement(By.xpath("//label[text()='E-mail']"));

       // WebElement e_mailText= driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        // WebElement emailInput_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
       // WebElement emailInput_ex1 = driver.findElement(By.xpath("//input[@type='text']"));
       // WebElement emailInput_ex1 = driver.findElement(By.cssSelector("div[class=\"large-6 small-12 columns\"]>input"));
        WebElement emailInput_ex1 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z0-9.-')]"));

        //e. “Retrieve password” button
        //WebElement retrivePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']>i"));
       // WebElement retrivePasswordButton = driver.findElement(By.xpath("//i[text()='Retrieve password']"));
       // WebElement retrivePasswordButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        // WebElement retrivePasswordButton = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        //f. “Powered by Cydeo text
       //?? WebElement poweredByCydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
         WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        //4. Verify all web elements are displayed.
        System.out.println("HomeButton_ex1.isDisplayed() = " + homeButton.isDisplayed());
        System.out.println("ForgotPassWordHeader_ex1.isDisplayed() = " +forgotPasswordHeader.isDisplayed());
        System.out.println("EmailText_ex1.isDisplayed() = " + e_mailText.isDisplayed());
        System.out.println("EmailInput_ex1.isDisplayed() = " + emailInput_ex1 .isDisplayed());

        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible


    }
}
