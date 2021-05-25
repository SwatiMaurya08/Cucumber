package com.softhinkers.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private static WebDriver driver = null;

    public BaseTest() {
        setUp();
    }

    public void setUp() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
            driver = new ChromeDriver();
            //driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            driver.manage().window().maximize();

        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
