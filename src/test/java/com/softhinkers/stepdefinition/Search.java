package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Search extends BaseTest {
    SearchPage searchPage;

    public Search() {
        searchPage = new SearchPage(getDriver());
    }

    @Given("user is on GreenKart landing page")
    public void userIsOnGreenKartLandingPage() {
        getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("the user search for {string} vegetable")
    public void theUserSearchForVegetable(String vegetable) {
        if (!vegetable.isEmpty() || null != vegetable) {
            switch (vegetable) {
                case "cucumber": {
                    searchPage.getSearchBox("cucumber");
                    break;
                }
                case "brinjal": {
                    searchPage.getSearchBox("brinjal");
                    break;
                }
            }
        }
    }


    @Then("{string} results are displayed")
    public void resultsAreDisplayed(String vegResult) {
        switch (vegResult) {
            case "cucumber": {
                String actual = searchPage.getCucumberText();
                String expected = "Cucumber - 1 Kg";
                Assert.assertEquals("Actual result does not matched to expected result", expected, actual);
                break;
            }
            case "brinjal": {
                String actual = searchPage.getBrinjalText();
                String expected = "Brinjal - 1 Kg";
                Assert.assertEquals("Actual result does not matched to expected result", expected, actual);
                break;
            }
        }

    }

    @And("added items to the cart")
    public void addedItemsToTheCart() {
        searchPage.getAddToCartButton();
    }

    @And("click on the item price bag")
    public void clickOnTheItemPriceBag() {
        searchPage.getItemPriceBagIcon();
    }

    @And("user proceed to click on proceed to checkout button")
    public void userProceedToClickOnProceedToCheckoutButton() {
        searchPage.getProceedToCheckOutButton();
    }

    @Then("verify selected {string} item are displayed in the checkout page")
    public void verifySelectedItemAreDisplayedInTheCheckoutPage(String veggie) {
        String actual = searchPage.getBrinjalText();
        String expected = "Brinjal - 1 Kg";
        Assert.assertEquals("Actual result does not matched to expected result", expected, actual);
    }


}
