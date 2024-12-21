package com.cbnits.ex18122014;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium04 {

    @Test
    public void testSelenium(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
    }
}
