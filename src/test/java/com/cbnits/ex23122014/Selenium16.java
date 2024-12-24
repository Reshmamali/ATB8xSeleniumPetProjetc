package com.cbnits.ex23122014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium16 {

    @Test
    public void testSelenium() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com/#/login");

//        Assert.assertEquals(driver.getTitle(), "Login - VWO");
//        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        Thread.sleep(3000);

        //<input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi">

        WebElement element_email = driver.findElement(By.id("login-username"));
        element_email.sendKeys("abc@gmail.com");

        //<input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // data-gtm-form-interact-field-id="2">

        WebElement element_password = driver.findElement(By.id("login-password"));
        element_password.sendKeys("admin@123");

        //<button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
        // onclick="login.login(event)" data-qa="sibequkica">

        WebElement sign_in = driver.findElement(By.id("js-login-btn"));
        sign_in.click();

        //<div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>

        Thread.sleep(3000);

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");






        driver.quit();


    }
}
