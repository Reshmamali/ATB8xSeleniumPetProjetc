package com.cbnits.ex20122014;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium10 {

    @Test
    public void testSelenium() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("src/test/java/com/cbnits/ex20122014/adblock.crx"));

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://vwo.com/");


    }
}
