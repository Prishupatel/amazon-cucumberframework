package com.amazon.cucumber.steps;

import com.amazon.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class homepage {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I search \"([^\"]*)\"$")
    public void iSearch(String item) {
        new HomePage().enterValuetosearch(item);

    }
}
