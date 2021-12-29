package com.amazon.cucumber.steps;

import com.amazon.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class laptopSteps {
    @And("^I changed the quantity \"([^\"]*)\"$")
    public void iChangedTheQuantity(String arg0)  {
       new ProductPage().selectQtyFromDropDown(arg0);
    }

    @And("^I click on 'Add to cart' button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCart();
    }


    @Then("^Product added to cart successfully$")
    public void productAddedToCartSuccessfully() throws InterruptedException {
        new ProductPage().verifyLaptopAddToCartMessage("Added to Cart");
    }
}
