package com.cbnits.ex18122014;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium01 {

    @Test
    public void testSelenium(){
//          // In Selenium 3
//        System.setProperty("webdriver.gecko.driver", "path/to/firefoxdriver");

        // Selenium 4
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
