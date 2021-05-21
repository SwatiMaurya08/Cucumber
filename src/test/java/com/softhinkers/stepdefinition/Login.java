package com.softhinkers.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
    @Given(": User is on NetBanking landing page")
    public void userIsOnNetBankingLandingPage() {
        System.out.println("On the Net Banking Page");
    }

    @When(": User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String username, String password) {
        System.out.println("Enter username and password");
        System.out.println(username);
        System.out.println(password);
    }

    @Then(": Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("Home page is populated");
    }

    @Then(": Cards are displayed {string}")
    public void cards_are_displayed(String cardstatus) {
        System.out.println("Cards status is shown" );
        System.out.println(cardstatus);

    }

    @When(": User sign up with following details")
    public void userSignUpWithFollowingDetails(DataTable table) {
        System.out.println(table.asList());
        System.out.println(table.asList());
        System.out.println(table.column(1));
        System.out.println(table.asMaps());
        System.out.println(table.getTableConverter());
    }

    @When(": User login in to application with (.+) and (.+)$")
    public void userLoginInToApplicationWithUsernameAndPassword(String username , String password) {
        System.out.println(username);
        System.out.println(password);
    }
}
