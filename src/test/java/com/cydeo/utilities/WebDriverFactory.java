package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TASK NEW METHOD CREATION;
//Method name:get driver                Java(getDriver())
//Static Method                         Java(static means you can able to call without  creating  an object(this is my main reason)  &becomes beloning to  the class itself!!)
//Accepts String arg: browserType
//-This arg will determine what type of browser is opened
//if " chrome "passed --->it will open Chrome browser
//if "firework" passed-->it will open firefox browser
//RETURN TYPE="WEB DRIVER"        Java( public Static WebDriver)
public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {


        if (browserType.equalsIgnoreCase("chrome")) {

            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();



        } else {
            System.out.println("Given String does not represent any driver");
            System.out.println("Either that browser does not exist or not currently supported  ");
            System.out.println("driver=null");
            return null;

        }

    }
}