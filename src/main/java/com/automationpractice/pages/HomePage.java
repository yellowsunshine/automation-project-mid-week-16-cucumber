package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li//a")
    List<WebElement> menuList;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li//ul//li//a")
    List<WebElement> innerMenuList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signInButton;

    @CacheLookup
    @FindBy(xpath = "//section[@id='block_various_links_footer']//ul[@class='toggle-footer']//a")
    List<WebElement> informationFooterOptions;


    public void selectItemFromMainMenu(String selection)  {
        for (WebElement name : menuList) {
            if (name.getText().equalsIgnoreCase(selection)) {
                pmDoMouseHoverNoClick(name);
                log.info("selecting an item from main menu : " + selection+ "<br>");
                break;
            }
        }
    }

    public void navigateToHomePage(){
        log.info("navigating back to home page : " + "<br>");
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    public void selectItemsFromInnerMenu(String innerMenu) {
        for (WebElement in : innerMenuList)
            if (in.getText().equalsIgnoreCase(innerMenu)) {
                pmMouseHoverAndClick(in);
                log.info("selecting an item from inner menu : " + innerMenu+ "<br>");
                break;
            }
    }

    public void clickOnSignInButton(){
        log.info("clicking on sign in button : " + signInButton.toString());
        pmClickOnElement(signInButton);
    }

}




