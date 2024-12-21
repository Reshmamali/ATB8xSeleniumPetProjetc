package com.cbnits.ex20122014;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class Selenium15 {

    @Test
    public void testClosebrowsermethods() throws InterruptedException {
        // Open the https://katalon-demo-cura.herokuapp.com/
        // Verify the title and search a string in pageSource
        // Add assertion that the Cura heatlh care Service is visible in the page source.

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // TestNG Assertion
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");

        // AsserJ
        assertThat(driver.getTitle()).isEqualTo("CURA Healthcare Service");
        System.out.println(driver.getTitle());
        assertThat(driver.getCurrentUrl()).isNotEmpty().isNotEmpty().isEqualTo("https://katalon-demo-cura.herokuapp.com/");



        if (driver.getPageSource().contains("sdsdsdCURA Healthcare Service")) {
            Assert.assertTrue(true);
        } else {
            System.out.println("Heading is not found");
        }
        driver.quit();
    }
}
