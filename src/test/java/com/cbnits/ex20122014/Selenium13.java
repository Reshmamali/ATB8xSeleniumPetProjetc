package com.cbnits.ex20122014;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium13 {

    @Test
    public void testClosebrowsermethods() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//        driver.get()
        driver.get("https://www.amazon.in/");

        Thread.sleep(5000);

        //driver.navigate().to / back / forward / refresh
        driver.navigate().to("https://www.flipkart.com/mobile-apps");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
