package com.cydeo.tests.review.day1_2_3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_Navigations_My_GetMethods {

    public static void main(String[] args)throws InterruptedException {

        // 1. Open a Chrome browser
         WebDriver driver= WebDriverFactory.getDriver("Chrome");
         driver.manage().window().maximize();

        //2.Go to: https://www.etsy.com
        driver.get("https://www.etsy.com");
        Thread.sleep(1000);

        // 3. Click on Registry link
        //WebElement RegistryLinkButton= driver.findElement(By.xpath("//a[text()='Registry']"));
       // WebElement RegistryLinkButton= driver.findElement(By.xpath("//a[@class='wt-btn wt-btn--transparent wt-btn--small']"));
        WebElement RegistryLinkButton= driver.findElement(By.xpath("a.wt-btn wt-btn--transparent wt-btn--small"));
        //RegistryLinkButton.click();

        // 4. Verify url contains "registry"

        String expectedUrl= "formations";
        String currentUrl= driver.getCurrentUrl();
        if(currentUrl.contains(expectedUrl)){
            System.out.println("Url verification Passed");
        }else{
           System.out.println("Url verification Failed");
        }

        // 5. Navigate to https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
       // driver.get("https://www.amazon.com");
        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); //to see if its ok
        // 6. Navigate back, forward and refresh
        driver.navigate().back();
        //Thread.sleep(1000);
        driver.navigate().forward();
        //Thread.sleep(1000);
        driver.navigate().refresh();
        // 7. Write “selenium” in search box
        WebElement SearchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        SearchBox.sendKeys("selenium"+ Keys.ENTER);

        // 8. Press search button to search
         SearchBox.click();

        // 9. Verify title is "Amazon.com : selenium"
        String expectedTitle="Amazon.com : selenium";
        String actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed");
        }else{
            System.out.println("Title verification Failed");
        }
        //10. Verify url contains "selenium"
        if(actualTitle.contains("selenium")){
            System.out.println("Url contains selenium");
        }else {
            System.out.println("Url doesn't contain selenium");

        }

         driver.close();

    }
}
