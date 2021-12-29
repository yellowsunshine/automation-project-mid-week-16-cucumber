package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Utility {

    private static final Logger log = LogManager.getLogger(ContactPage.class.getName());


    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//select[@id='id_contact']")
    WebElement subjectHeadingDropdown;

    @CacheLookup
    @FindBy (xpath = "//select[@name='id_order']")
    WebElement orderReferenceDropdown;

    @CacheLookup
    @FindBy (xpath = "//select[@id='392711_order_products']")
    WebElement productDropdown;

    @CacheLookup
    @FindBy (xpath = "//input[@id='fileUpload']")
    WebElement attachFileBox;

    @CacheLookup
    @FindBy (xpath = "//textarea[@id='message']")
    WebElement messageBox;

    @CacheLookup
    @FindBy (xpath = "//button[@id='submitMessage']")
    WebElement sendButton;

    public void chooseASubjectHeading(String subject){
        log.info("choose a subject heading : " + subject + "<br>");
        pmSelectByVisibleTextFromDropDown(subjectHeadingDropdown, subject);
    }

    public void chooseAnOrderReference(){
        log.info("choose a order reference : "  + "<br>");
        pmselectByIndexFromDropDown(orderReferenceDropdown, 1);
    }

    public void chooseAProductFromDropdown(){
        log.info("choose a product : " + "<br>");
        pmselectByIndexFromDropDown(productDropdown, 1);

    }

    public void fileUpload(String filePath){
        log.info("attach a file : " + "<br>");
        attachFileBox.sendKeys(filePath);
    }

    public void inputMessage(String message){
        log.info("input refund message : " + message + "<br>");
        pmSendTextToElement(messageBox, message );
    }

    public void clickOnSendButton(){
        log.info("click on send button : " + sendButton.toString() + "<br>");
        pmClickOnElement(sendButton);
    }
}
