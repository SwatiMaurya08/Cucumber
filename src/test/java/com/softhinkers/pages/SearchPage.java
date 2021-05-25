package com.softhinkers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public final String searchBoxXpath = "//input[@type ='search' ]";
    public final String cucumberTextPath = "//h4[text()='Cucumber - 1 Kg']";
    public final String brinjalTextPath = "//h4[text()='Brinjal - 1 Kg']";
    public final String addToCartButton = "//button[text()= 'ADD TO CART']";
    public final String itemPriceBagIcon = "//img[@src ='https://res.cloudinary.com/sivadass/image/upload/v1493548928/icons/bag.png']";
    public final String proceedToCheckOutButton = "//button[text()='PROCEED TO CHECKOUT']";
    public final String brinjalGetTextResult = "//p[text() = 'Brinjal - 1 Kg']";


    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = searchBoxXpath)
    WebElement searchBox;

    @FindBy(xpath = cucumberTextPath)
    WebElement cucumberText;

    @FindBy(xpath = brinjalTextPath)
    WebElement brinjalText;

    @FindBy(xpath = addToCartButton)
    WebElement addToCart;

    @FindBy(xpath = itemPriceBagIcon)
    WebElement itemPriceBag;

    @FindBy(xpath = proceedToCheckOutButton)
    WebElement proceedToCheckOut;

    @FindBy(xpath = brinjalGetTextResult)
    WebElement brinjalGetText;


    public void getSearchBox(String vegetable) {
        searchBox.click();
        searchBox.sendKeys(vegetable);
    }

    public String getCucumberText() {
        return cucumberText.getText();

    }

    public String getBrinjalText() {
        return brinjalText.getText();

    }

    public void getAddToCartButton() {
        addToCart.click();
    }

    public void getItemPriceBagIcon() {
        itemPriceBag.click();
    }

    public void getProceedToCheckOutButton() {
        proceedToCheckOut.click();
    }

    public String getBrinjalGetTextResult() {
        return brinjalGetText.getText();
    }
}
