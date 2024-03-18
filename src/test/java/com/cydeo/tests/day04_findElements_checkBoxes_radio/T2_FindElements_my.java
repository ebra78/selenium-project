package com.cydeo.tests.day04_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_FindElements_my {
    public static void main(String[] args) {


        //TC #2: FindElements Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate all the links in the page.
       // WebElement homeLink= driver.findElement(By.cssSelector("li[class='nav-item']>a"));
       // WebElement homeLink= driver.findElement(By.cssSelector("a.nav-link"));
        // WebElement homeLink= driver.findElement(By.xpath("//a[@href=\"/\"]"));
        WebElement homeLink= driver.findElement(By.xpath("//a[text()='Home']"));
        //WebElement CydeoLink= driver.findElement(By.cssSelector("div[style='text-align: center;']>a"));
       // WebElement CydeoLink= driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        WebElement CydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));
        //4- Print out the number of the links on the page.


        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links


    }

}
