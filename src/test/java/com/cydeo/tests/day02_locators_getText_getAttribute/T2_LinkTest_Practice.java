package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTest_Practice {
    public static void main(String[] args) {
        //TC #2: Back and forth navigation
        //1- Open a Chrome browser
        WebDriver driver = new ChromeDriver(); //WE OPEN CHROME BROWSER AND CREATED A DRIVER OBJECT!!AND STORED OUR OBJECT(SOLTARAFA)
        driver.manage().window().maximize();//
        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com"); //WE GO TO THIS URL USING GET METHOD!

        driver.findElement(By.xpath("//div[.='Accept all']")).click();
        //3- Click to A/B Testing from top of the list.
       // driver.findElement(By.linkText("A/B Testing")).click();//WE ARE SUPPOSED TO CLICKING SOMETHING SO TO BE ABLE TO CLICK WE HAVE TO LOCATE
                                                              //WEB ELEMENT SO WE HAVE TO USE findELEMENT THAT ACCEPTS DIFFERENT TYPE OF LOCATERS AND THE FIRST LOCATER WE LEARNED IS "THE LINK LOCATER"
                                                              //AND LINK LOCATER ACCEPTS STRING THAT WE ARE TRYING TO LOCATE AND IT FINDS THIS WEB ELEMENT(A/B TEXTING)RETURNS IT TO MY DRIVER AND MY DRIVER IS ABLE TO CLICK
                                                             //click()

        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();                            //  THIS WAY I CREATE A REUSABLE WEB  ELEMENT RATHER THAN (driver.findElement(By.linkText("A/B Testing")).click()
        // IT'S JUST GONNA BE COMPLETLY DISAPPERING AFTER ONE LINE O YUZDEN BOYLE YAP
                                                         //YANI YENI BIR VARIABLE YAP KAYBOLMAZ VE HER ZAMAN KULLANIRSIN


        //4- Verify title is:
        //Expected: No A/B Test
        //Thread.sleep(2000);
        String expectedTitle = "No A/B Test";                    //for verification
        String actualTitle = driver.getTitle();                   //for verification

        if (actualTitle.equals(expectedTitle)) {                 //for verification
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAIL!");
        }

        //5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals:   //here we have 2 options 1-We can create a new string or 2-we can reuse the existing string
                                     //i am overriding the value what i have before yukarda
        //Expected: Practice
         expectedTitle = "Practice";
         actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAIL!");
        }






    }
    }

