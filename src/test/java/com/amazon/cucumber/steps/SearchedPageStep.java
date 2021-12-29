package com.amazon.cucumber.steps;

import com.amazon.pages.SearchedPage;
import cucumber.api.java.en.And;

public class SearchedPageStep {
//    @And("^I click on \"([^\"]*)\"$")
//    public void iClickOn(String item) {
//       new SearchedPage().searchItemOnFirstPage(item);
//    }


    @And("^I click  on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws InterruptedException {
       new SearchedPage().clickOnProduct(arg0);
    }
}
