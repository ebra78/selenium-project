package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNagivations {

    public static void main(String[] args) throws InterruptedException {

        //Set up my  browser driver


        //Create Instance of Chrome driver
        WebDriver driver= new ChromeDriver();

        //this line will maximize the currently opened browser
        driver.manage().window().maximize();//hemen basa koydum

        //go to tesla.com
        driver.get("https://www.tesla.com");

        //use getCurrentUrl method to print out current url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //get the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        //Instead of printing my title I can store it  HOW?

        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //use navigate back() to go back
       driver.navigate().back();
        //stop execution for 3 seconds
        Thread.sleep(1000);

        //use navigate forward() to go forward
        driver.navigate().forward();

        //stop execution for 3 seconds
        Thread.sleep(1000);

        driver.navigate().to("https://google.com");

        //use getCurrentUrl method to print out current url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());



        //stop execution for 3 seconds
        Thread.sleep(1000);

        //user refreshes the page using navigate().refresh()
        driver.navigate().refresh();
        //get the title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());
            //you have 2 options :it depends what you want if you want to store seperatly just assing in different variable but if you dont
            //need to store seperatly then override
         //String currentTitle1= driver.getTitle();//ayni variable ile method cagiramazsin variable degistiridm
          //currentTitle= driver.getTitle();     //if you don't have to store seperatly you can make it override as here


        System.out.println("currentTitle = " + currentTitle);


        currentTitle= driver.getTitle();


        driver.close(); //closes only currently focused window/tab.
        driver.quit(); //closes all - of the opened browsers.bilgisayarinda acik olan tum sayfalari kapatiyor







    }
}
