package com.cydeo.tests.day04_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T3_CheckBoxes_radiobuttons {
    public static void main(String[] args) throws InterruptedException {
        //TC#3: Checkboxes
        //1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(" https://practice.cydeo.com/checkboxes");
         //First we have to locate boxes !!
        WebElement checkBox1= driver.findElement(By.cssSelector("input[id='box1']"));// checkBox1
        WebElement checkBox2= driver.findElement(By.cssSelector("input[id='box2']"));// checkBox2


        //2. Confirm checkbox #1 is NOT selected by default //should turn me False=not selected so the result as we expected
        System.out.println("checkBox1.isSelected(),expecting False = " + checkBox1.isSelected());
        //3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkBox2.isSelected(),expecting True = " + checkBox2.isSelected());//should turn me True as I want it!

        //4. Click checkbox #1 to select it.

        checkBox1.click();
        Thread.sleep(2000); //2 seconds


        //5. Click checkbox #2 to deselect it.
        checkBox2.click();
        Thread.sleep(2000);
        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected(),expecting true = " + checkBox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2.isSelected(),expecting false = " + checkBox2.isSelected());







    }
}
