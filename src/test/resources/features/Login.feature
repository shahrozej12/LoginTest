Feature: Login feature of Saucedemo

  Background:
    Given  Launch Application

  Scenario: Successful login
    Given User enters username and password
    When User clicks submit button
    Then User  should be logged in successfully

    Scenario:Successful Logout
      Given User enters username and password
      When User clicks submit button
      Given User presses sidebar
      Then Users press logout button
      And  logged out successfully

