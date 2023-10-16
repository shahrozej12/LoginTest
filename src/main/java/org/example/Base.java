package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shahroze\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver =new ChromeDriver();

    }
    public static void Home(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void close(){
        driver.quit();
    }
}
