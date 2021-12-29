package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AuthenticationPage extends Utility {

    private static final Logger log = LogManager.getLogger(AuthenticationPage.class.getName());


    public AuthenticationPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (id = "email_create")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy (id = "email")
    WebElement signInEmailAddressField;

    @CacheLookup
    @FindBy (id = "passwd")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAnAccount;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    WebElement signInButton;

    public void enterEmailInTheEmailAddressField(String email){
        log.info("entering email : "+ email+ "<br>");
        pmSendTextToElement(emailAddressField, email);
    }

    public void clickOnCreateAnAccountTab(){
        log.info("Click on the create an account tab : " + createAnAccount.toString() + "<br>");
        pmClickOnElement(createAnAccount);
    }

    public void logInWithTheCreatedCredentials(String email, String pword){
        log.info("loggin in : " + email.toString() + "<br>");
        pmSendTextToElement(signInEmailAddressField, email);
        pmSendTextToElement(password, pword);
        pmClickOnElement(signInButton);
    }
}
