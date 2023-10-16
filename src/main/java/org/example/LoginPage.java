package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends  Base {

    public static String Username="user-name";
    public static String Password="password";
    public static String btnSubmit="login-button";
    public  static String clickSide="react-burger-menu-btn";

    public static String Logout="logout_sidebar_link";

    public static void enterUsername(String strUsername){
        driver.findElement(By.id(Username)).sendKeys(strUsername);
    }
    public static void enterPassword(String strPassword){
        driver.findElement(By.id(Password)).sendKeys(strPassword);
    }
    public static void clickLogin(){
        driver.findElement(By.id(btnSubmit)).click();
    }
        public static void title(){
            String text=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
            Assert.assertEquals(text,"Products");
        }
    public static void clickSidebar(){
        driver.findElement(By.id(clickSide)).click();
    }
    public static void btnLogout(){
        driver.findElement(By.id(Logout)).click();
    }

    public static void logoutTitle(){
        String txt= driver.findElement((By.xpath("//*[@id=\"root\"]/div/div[1]"))).getText();
        Assert.assertEquals(txt,"Swag Labs");

    }



}
