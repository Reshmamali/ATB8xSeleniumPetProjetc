package com.cbnits.ex23122014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium18 {

    @Test
    public void testSelenium() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://vwo.com/free-trial");

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("reshmamali7611com");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        List<WebElement> button = driver.findElements(By.tagName("button"));
        button.get(0).click();

        Thread.sleep(3000);

        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");

        driver.quit();


    }
}
