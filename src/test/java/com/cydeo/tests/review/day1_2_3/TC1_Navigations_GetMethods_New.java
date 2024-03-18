package com.cydeo.tests.review.day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Navigations_GetMethods_New {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/");

        WebElement automatonTrainingLink = driver.findElement(By.linkText(("Automation Training")));
        automatonTrainingLink.click();

        if (driver.getCurrentUrl().contains("formations")) {
            System.out.println("URL verification is passed!");

        } else {
            System.out.println("URL verification is failed");
        }
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}