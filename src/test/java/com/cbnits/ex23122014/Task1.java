package com.cbnits.ex23122014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task1 {

    @Test
    public void testKatalonStudioLoginPage() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment = driver.findElement(By.id("btn-make-appointment"));
        make_appointment.click();

        WebElement Username = driver.findElement(By.id("txt-username"));
        Username.sendKeys("John Doe");

        WebElement Password = driver.findElement(By.id("txt-password"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.id("btn-login"));
        login_button.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");


        Thread.sleep(3000);

        driver.quit();
    }
}
