package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;

    @FindBy(id = "quantity")
    WebElement selectQty;

    @FindBy(xpath = "//div[@id='attachDisplayAddBaseAlert']//h4[@class='a-alert-heading'][normalize-space()='Added to Cart']")
    WebElement laptopAddToCartMessage;

    @FindBy(xpath = "//div[@id='attachDisplayAddBaseAlert']//h4[@class='a-alert-heading'][normalize-space()='Added to Cart']")
    WebElement mobileAddToCartMessage;

    public void selectQtyFromDropDown(String qty) {
       selectByValueFromDropDown(selectQty,qty);
        log.info("Selecting quantity from dropdown  " + selectQty.toString());
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCartButton);
        log.info("Clicking on Add to cart button  " + addToCartButton.toString());
    }

    public void verifyLaptopAddToCartMessage(String message) throws InterruptedException {
        Thread.sleep(1000);
        String actualString = getTextFromElement(laptopAddToCartMessage);
        System.out.println("text of message: " + actualString);
        Assert.assertTrue(actualString.contains((message)));
        log.info("Verifying laptop added to cart message  " + message.toString());

    }
    public void verifyMobileAddToCartMessage(String message) throws InterruptedException {
        Thread.sleep(2000);
        String actualString =getTextFromElement(mobileAddToCartMessage);
        System.out.println("text of message: " + actualString);
        Assert.assertTrue(actualString.contains((message)));
        log.info("Verifying mobild phone added to cart message  " + message.toString());

    }


}
