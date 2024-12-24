package com.cbnits.ex23122014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 {

    @Test
    public void testawesomeqa() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        WebElement First_name = driver.findElement(By.name("firstname"));
        First_name.sendKeys("Reshma");

        WebElement Last_name = driver.findElement(By.name("lastname"));
        Last_name.sendKeys("Mali");

        WebElement  Gender_female= driver.findElement(By.id("sex-1"));
        Gender_female.click();

        WebElement  Years_of_Experience= driver.findElement(By.id("exp-4"));
        Years_of_Experience.click();

        WebElement  date= driver.findElement(By.id("datepicker"));
        date.sendKeys("21-12-2024");

        WebElement  profession= driver.findElement(By.id("profession-1"));
        profession.click();

        Thread.sleep(5000);

        WebElement  automation_tool = driver.findElement(By.id("tool-2"));
        automation_tool.click();

        WebElement  automation_tool1 = driver.findElement(By.id("tool-0"));
        automation_tool1.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/practice.html");
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(5000);
        driver.quit();
    }
}
