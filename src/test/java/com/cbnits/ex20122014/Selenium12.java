package com.cbnits.ex20122014;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium12 {

    @Test
    public void testClosebrowsermethods() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");

        Thread.sleep(5000);

//          Close vs Quite
//        driver.close();
        // Close the Current Browser Window - not the full browser
        // Closed the window, Session id != null, Error - Invalid session ID



        driver.quit();
        // Close all the /sessions/windows and stop the browser
        // Closed All the window and Session = null, Error - Session ID is null




    }
}
