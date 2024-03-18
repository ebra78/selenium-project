package com.cydeo.tests.day03_cSSselector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_cssSelector {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver=WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        String expectedText="Log In";
        //Locating Log In Button using class attribute's value:
       // WebElement  logInButton= driver.findElement(By.className("login-btn"));

        //Locating Log In Button using cssSelector using type attribute's value:
          //3 DEGISIK SEKILDE AYNI WEB ELEMENTE(input tag name) LOCATE ETTIK       //tagname=[attribute='value']
        //WebElement logInButton= driver.findElement(By.cssSelector("input[type='submit']"));
       // WebElement logInButton= driver.findElement(By.cssSelector("input[class='login-btn']"));
         WebElement logInButton= driver.findElement(By.cssSelector("input[value='Log In']"));

        //BEFORE YOU RUN IT CHECK IT FROM THE INSPECT /FILTER/PRESS ON "ctrl f"/paste tagname=[attribute='value']
        //If it sayS 1>1 MEANS MY CODE IS RUN!!MEANS NO THROWING :" NOSUCHELEMENT!"

        //get text()method reads only the text which  is in between opening tag and closing tag!<span>Getin</span>
        //get attribute()method allow us to read attribute values.You call by attribute and returns you it's VALUE!
        //BY THE WAY if this log in text displayed on normal page it's going to be betwween opening and closing tag but here
        //it 's on specific page WHICH allows me to use dot text method!!!
        String actuallLoginText=logInButton.getAttribute("value");//return me Log In


        //SO INSTEAD OF USE 6 LOCATERS THAT WE LEARNED WE US cssSelector to locate our web element!

        WebElement loginButton =driver.findElement(By.cssSelector("input.login-btn"));

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
