package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchBar;

    @FindBy(css = "#nav-search-submit-button")
    WebElement searchIcon;




    public void enterValuetosearch(String item) {
        sendTextToElement(searchBar, item);
        log.info("sending text to search bar " + searchBar.toString());
        clickOnElement(searchIcon);
        log.info("clicking on search icon");
    }


}
