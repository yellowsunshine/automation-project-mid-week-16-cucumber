package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressesPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAddressesPage.class.getName());

    public MyAddressesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//ul[@class='last_item item box']")
    WebElement addressBox;

    public void verifyMyAddress(String add1, String add2){
        log.info("verifying my address : " +  "<br>");
        Assert.assertTrue(addressBox.getText().contains(add1));
        Assert.assertTrue(addressBox.getText().contains(add2));
    }
}
