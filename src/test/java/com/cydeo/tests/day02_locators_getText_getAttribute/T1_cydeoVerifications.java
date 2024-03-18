package com.cydeo.tests.day02_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T1_cydeoVerifications {

    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
       // WebDriver driver= new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize(); //

        //2. Go to https://practice.cydeo.com
        //driver.get("https://practice.cydeo.com");//
        driver.navigate().to("https://practice.cydeo.com");
        //3. Verify URL contains
         String expectedInUrl="cydeo";
         String actualURL= driver.getCurrentUrl();
           if(actualURL.contains(expectedInUrl)) {
               System.out.println("URL verification Passed");                                     //verification system to see on the console
           }else{
               System.out.println("URL verification Failed ");

        }

                     //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());bu benim yaptigim
            //Expected: cydeo
            //4. Verify title:
            //Expected: Practice
                     //String currentTitle= driver.getTitle();bu benim yaptigim
           // if (driver.getTitle().equals("Practice")){ boylede yapabilirsin yani yeni bir variable yaratmadan ama ilerde
                  // donup baktiginda anlaman zorlasir her zaman yeni bir variable ataman kodu okuman acisindan daha temiz ve ayrica
               // mutlaka once comment yaz altina check et asagidaki gibi!!!TAVSIYEEEE
                //System.out.println("Pass");
            //}

            String expectedTitle="Practice";
           String CurrentTitle= driver.getTitle();   //returns "Practice"
            if(CurrentTitle.equals(expectedTitle)){
                System.out.println("Expected title Passed");


            }else{
                System.out.println("Expected title Failed");
            }

              //close the browser
               // driver.close();




    }
}
