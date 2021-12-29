package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());


    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='product_list grid row']//li//h5//a")
    List<WebElement> productTitle;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Printed Dress'][normalize-space()='Printed Dress']")
    WebElement dress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;

    public void selectProduct(String productName) {
        boolean myBreak = true;
        if (dress.getText().equalsIgnoreCase(productName)) {
            pmClickOnElement(dress);
            log.info("selecting an item from menu : " + productName+ "<br>");
        } else {
            while (myBreak)
            for (WebElement product : productTitle) {
                if (product.getText().equalsIgnoreCase(productName)) {
                    pmClickOnElement(product);
                    log.info("selecting an item from menu : " + productName+ "<br>");
                    myBreak = false;
                    break;
                }
            }
        }
    }

    public void selectQuantity(String qty) {
        log.info("selecting quantity : " + qty+ "<br>");
        pmFindElementAndClearText(quantity);
        pmSendTextToElement(quantity, qty);

    }


}
