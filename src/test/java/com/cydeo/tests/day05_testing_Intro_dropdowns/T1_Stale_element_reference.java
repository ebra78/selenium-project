package com.cydeo.tests.day05_testing_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_Stale_element_reference {
    public static void main(String[] args) throws InterruptedException {


        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button     //button[.='Add Element']
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        //4. Verify “Delete” button is displayed after clicking.  //button[.='Delete']
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteButton.isDisplayed(),expecting TRUE = " + deleteButton.isDisplayed()); //with dot to call method
        //RETURN ME TRUE VALUE!

        //5. Click to “Delete” button.
        Thread.sleep(2000);
        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.  //In T4 task we use different way cause it was refresh!
        //use "try/catch" to handle and verify//in here web element deleted that why we use this way
        try {
            System.out.println("deleteButton.isDisplayed(), expecting false = " + deleteButton.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("-->StaleElementReferenceException happened due to element being deleted from the page.");
            System.out.println("Which concludes our test case -PASSING!-");
            System.out.println("deleteButton.isDisplayed()= false ");
        }


    }

    }

