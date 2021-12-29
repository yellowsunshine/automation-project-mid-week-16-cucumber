package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//a[@title='Addresses']")
    WebElement myAddressesTab;

    @CacheLookup
    @FindBy (xpath = "//section[@id='block_various_links_footer']//ul//li//a")
    List<WebElement>informationFooter;

    @CacheLookup
    @FindBy (xpath = "//h1[normalize-space()='Customer service - Contact us']")
    WebElement contactPageVerificationText;


    public void clickOnMyAddresses(){
        log.info("clicking on my addresses : " + myAddressesTab+ "<br>");
        pmClickOnElement(myAddressesTab);
    }

    public void verifyContactPageText(String text){
        log.info("verifying contact page text : " + text+ "<br>");
        Assert.assertTrue(contactPageVerificationText.getText().contains(text));
    }

    public void selectMenuFromInformationFooter(String selection)  {
        for (WebElement e:informationFooter){
            if (e.getText().equalsIgnoreCase(selection)){
                pmClickOnElement(e);
                log.info("selecting an item from information footer menu : " + selection+ "<br>");
                break;
            }
        }

    }


}
