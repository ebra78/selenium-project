package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMWP2_zero_Bank_header_Verification {

    public static void main(String[] args) {
        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text //verify yapmak icin locate etmen lazim sonra verify if ile yapican
        WebElement currentText=driver.findElement(By.tagName("h3"));//locate edip buldugun degeri Webelement assign edicen

        String expectedHeaderText="Log in to ZeroBank"; //expect olan value belirticen
        String actualHeaderText=currentText.getText();//locate edip buldugun degerin textini cagirip olan text variable yuklucen


        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification Passed");
        }else{
            System.out.println("Header text verification Failed");
        }
        //Expected: “Log in to ZeroBank”


    }


}
