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


public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@title='Continue shopping']//span[1]")
    WebElement continueShopping;

    @CacheLookup
    @FindBy(xpath = "//a[@title='View my shopping cart']")
    WebElement shoppingCartLogo;

    @CacheLookup
    @FindBy(xpath = "//table[@id='cart_summary']//tr//p//a")
    List<WebElement> productNameVerification;

    @CacheLookup
    @FindBy(xpath = "//table[@id='cart_summary']//tr//small[1]")
    List<WebElement> productSKUVerification;

    @CacheLookup
    @FindBy(xpath = "//td[@class = 'cart_quantity text-center']//input[1]")
    List<WebElement> productQuantityVerification; //use get attribute of field value

    @CacheLookup
    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
    WebElement proceedToCheckoutButton;

    @CacheLookup
    @FindBy(xpath = "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
    WebElement proceedToCheckoutButtonAddressPage;

    @CacheLookup
    @FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
    WebElement proceedToCheckoutButtonShippingPage;

    @CacheLookup
    @FindBy(id = "uniform-cgv")
    WebElement termsAndConditionsBox;

    @CacheLookup
    @FindBy(xpath = "//div[@id='HOOK_PAYMENT']//p//a[1][contains(.,'Pay by check (order processing will be longer)')]")
    WebElement payByCheckButton;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='I confirm my order']")
    WebElement iConfirmMyOrderButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='alert alert-success']")
    WebElement paymentVerificationText;



    public void clickOnContinueShoppingButton() {
        log.info("clicking on continue shopping button : " + continueShopping+ "<br>");
        pmClickOnElement(continueShopping);
    }

    public void clickOnShoppingCart() {
        log.info("clicking on shopping cart logo : " + shoppingCartLogo+ "<br>");
        pmClickOnElement(shoppingCartLogo);
    }

    public void verifyShoppingCart(String name, String sKU, String quantity) {
        for (WebElement n : productNameVerification)
            if (n.getText().equalsIgnoreCase(name)) {
                System.out.println(n.getText());
                Assert.assertTrue(n.getText().equalsIgnoreCase(name));
                log.info("verifying product name : " + name+ "<br>");
            }

        for (WebElement s : productSKUVerification)
            if (s.getText().equalsIgnoreCase(sKU)) {
                System.out.println(s.getText());
                Assert.assertTrue(s.getText().equalsIgnoreCase(sKU));
                log.info("verifying product SKU : " + sKU+ "<br>");
            }

        for (WebElement q : productQuantityVerification)
            if (q.getAttribute("value").equalsIgnoreCase(quantity)) {
                System.out.println(q.getAttribute("value"));
                Assert.assertTrue(q.getAttribute("value").equalsIgnoreCase(quantity));
                log.info("verifying product quantity : " + quantity+ "<br>");
            }
    }

    public void clickOnCheckoutButton(){
        log.info("click on checkout button : " + proceedToCheckoutButton.toString()+ "<br>");
        pmClickOnElement(proceedToCheckoutButton);
    }

    public void clickOnCheckoutButtonOnAddressPage(){
        log.info("click on checkout button on address page : " + proceedToCheckoutButtonAddressPage.toString()+ "<br>");
        pmClickOnElement(proceedToCheckoutButtonAddressPage);
    }

    public void clickOnTermsAndConditionsBoxOnShippingPage(){
        log.info("click on checkout button on shipping page : " + termsAndConditionsBox.toString()+ "<br>");
        pmClickOnElement(termsAndConditionsBox);
    }

    public void clickOnCheckoutButtonShippingPage(){
        log.info("click on checkout button on shipping page : " + proceedToCheckoutButtonShippingPage.toString()+ "<br>");
        pmClickOnElement(proceedToCheckoutButtonShippingPage);
    }

    public void clickOnPayByCheckOption(){
        log.info("click on pay by check button : " + payByCheckButton.toString()+ "<br>");
        pmClickOnElement(payByCheckButton);
    }

    public void clickOnIConfirmMyOrder(){
        log.info("click on confirm my order : " + iConfirmMyOrderButton.toString()+ "<br>");
        pmClickOnElement(iConfirmMyOrderButton);
    }

    public void verifyOrderIsCompleteByUsingCheckPaymentOption(String verificationText){
        log.info("verifying the order is completed : " + paymentVerificationText.getText()+ "<br>");
        Assert.assertTrue(paymentVerificationText.getText().contains(verificationText));
    }
}
















