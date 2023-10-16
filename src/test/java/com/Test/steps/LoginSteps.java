package com.Test.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Base;
import org.example.LoginPage;
import org.openqa.selenium.WebDriver;


public class LoginSteps extends Base {
    public static WebDriver driver;
    @Before
    public void OpenPage(){
        setDriver();
    }
    @Given("Launch Application")
    public void launch_application() {
        Home();
    }

    @Given("User enters username and password")
    public void userEntersAnd() {
        LoginPage.enterUsername("standard_user");
        LoginPage.enterPassword("secret_sauce");


    }
    @When("User clicks submit button")
    public void user_clicks_submit_button() {
        LoginPage.clickLogin();
    }


    @Then("User  should be logged in successfully")
    public  void user_should_be_logged_in_successfully() {
       LoginPage.title();
       System.out.println("Login successfully");
    }


    @Given("User presses sidebar")
    public void userPressesSidebar() {
        LoginPage.clickSidebar();
    }

    @Then("Users press logout button")
    public void usersPressLogoutButton() {
        LoginPage.btnLogout();
    }

    @And("logged out successfully")
    public void loggedOutSuccessfully() {
        LoginPage.logoutTitle();
        System.out.println("Logout successfully");

    }

}
