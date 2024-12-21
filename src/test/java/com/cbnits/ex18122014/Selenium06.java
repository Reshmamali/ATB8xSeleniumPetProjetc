package com.cbnits.ex18122014;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium06 {

    @Test
    public void testSelenium(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
    }
}
