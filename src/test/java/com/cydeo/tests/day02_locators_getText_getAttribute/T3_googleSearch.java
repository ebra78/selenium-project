package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_googleSearch {

    public static void main(String[] args) {
        //1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();  //  WE SET UP OUR BROWSER DRIVER-WE CREATE OUR DRIVER INTANCE
        driver.manage().window().maximize();

        //2- Go to: https://google.com      //
        driver.get("https://google.com");
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }

        driver.findElement(By.xpath("//div[.='Accept all']")).click();

        //3- Write “apple” in search box
        //a-Locate the search box
        WebElement googleSearchBox = driver.findElement(By.name("q")); //WE LOCATE SEARCH BOX ELEMENT BY" FIND ELEMENT METHOD"
        // AND name LOCATER SPECIFIC (name WHICH IS LOCATED GOOGLE.Com) WHICH IS "q" value
        //WE STORE THIS VALUE TO THE VARIABLE THAT WE CREATE(googleSearchBox)
        //b-enter "apple" key and press ENTER
        googleSearchBox.sendKeys("apple" + Keys.ENTER); //WE USE THIS VARIABLE WE USE THIS METHOD(sendKeys)TO SEND string apple AND PRESS ENTER!

        //4- Press ENTER to search driver.

        //googleSearchBox.sendKeys(Keys.ENTER);   buna gerek kalmadi

        //5- Verify title:                                    //FINALLY WE VERIFY OUR TITLE!!
        //Expected: Title should start with “apple” word

        String expectedTitleBegins = "apple";   //
        String actualTitle = driver.getTitle();  //

        if (actualTitle.startsWith(expectedTitleBegins)) {  //
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


        //To enter text using sendKeys() in Selenium,
        // you first need to identify the web element you want to interact with,
        // such as a text box or an input field.
        // You can use the WebDriver's findElement() method to locate the element,
        // and then call the sendKeys() method on that element, passing in the text you want to enter


        //NOT
        //APPLE yazacagin yeri once locate etmen lazim nasil??
        // apple yazacagin yere tikla inspect sonra input(html BILGINLE)
        // (enter function  oldugu zaman)BUL SONRA "name locater " bul orda string
        // icinde q gorucen onu yaz bu senin box a ulasmani saglayan kod!
        //burda ne yaptim Locate search box


    }
}
