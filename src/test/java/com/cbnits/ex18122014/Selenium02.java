package com.cbnits.ex18122014;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium02 {

    @Test
    public void testSelenium() {

        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://app.vwo.com");
        driver.quit();
    }
}
