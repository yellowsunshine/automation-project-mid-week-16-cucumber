package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;


public class OnlineShoppingSteps {

    static String email = "abcd1234987@gmail.com";
    static String email1 = "prime@gmail.com";
    static String password = "Prime123";
    static String add1 = "999 Prime Road";
    static String add2 = "London, Florida 12345";

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @Then("^Navigate to SignUp page$")
    public void navigateToSignUpPage() {
        new HomePage().clickOnSignInButton();
    }


    @And("^create an account with random username$")
    public void createAnAccountWithRandomUsername(DataTable dataTable) {
        new AuthenticationPage().enterEmailInTheEmailAddressField(email);
        new AuthenticationPage().clickOnCreateAnAccountTab();

        List<List<String>> userDetails = dataTable.asLists(String.class);
        for (List<String> e : userDetails) {
            new CreateAccountPage().fillMandatoryFields(e.get(0), e.get(1), e.get(2), e.get(3), e.get(4), e.get(5), e.get(6), e.get(7));
        }
    }

    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
        new HomePage().clickOnSignInButton();
    }


    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
        new AuthenticationPage().logInWithTheCreatedCredentials(email1, password);
    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
        new MyAccountPage().clickOnMyAddresses();
        new MyAddressesPage().verifyMyAddress(add1, add2);
    }

    @And("^I add below product to cart$")
    public void iAddBelowProductToCart(DataTable table) {
        List<List<String>> data = table.raw();
        for (int i = 1; i < data.size(); i++) {//start i from 1 to ignore the header row
            new HomePage().navigateToHomePage();
            //  getting data from row 1 and column 0
            new HomePage().selectItemFromMainMenu(data.get(i).get(0));
            new HomePage().selectItemsFromInnerMenu(data.get(i).get(1));
            new ProductPage().selectProduct(data.get(i).get(2));
            new ProductPage().selectQuantity(data.get(i).get(4));
            new SummerDressesPage().addToCart();
            new ShoppingCartPage().clickOnContinueShoppingButton();
        }
    }

    @Then("^I shall validate shopping cart as below$")
    public void iShallValidateShoppingCartAsBelow(DataTable table) {
        //convert data table to a raw table, this map will return a list of map (of string as key and string as value)
        // raw methods return type is List<List<String>>
        List<List<String>> data1 = table.raw();
        for (int i = 1; i < 3; i++) {
            new ShoppingCartPage().clickOnShoppingCart();
            new ShoppingCartPage().verifyShoppingCart(data1.get(i).get(0), data1.get(i).get(1), data1.get(i).get(2));
        }
    }

    @And("^I add below product to cart using Maps$")
    public void iAddBelowProductToCartUsingMaps(DataTable dataTable) {
        //convert data table to map, this map will return a list of map (of string as key and string as value)
        //first row acts as a header which is a key
        List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < userList.size(); i++) {//Header row is considered key, value row starts from 0
            new HomePage().navigateToHomePage();
            //retrieving item from row (index number) of the column called category
            //each and every row value will be mapped with respective column headers
            //There are 3 rows, from row # 0 get me the value of the key called category
            new HomePage().selectItemFromMainMenu(userList.get(i).get("category"));
            //There are 3 rows, from row # 0 get me the value of the key called subCategory
            new HomePage().selectItemsFromInnerMenu(userList.get(i).get("subCategory"));
            //There are 3 rows, from row # 0 get me the value of the key called name
            new ProductPage().selectProduct(userList.get(i).get("name"));
            //There are 3 rows, from row # 0 get me the value of the key called quantity
            new ProductPage().selectQuantity(userList.get(i).get("quantity"));
            new SummerDressesPage().addToCart();
            new ShoppingCartPage().clickOnContinueShoppingButton();
        }
    }

    @Then("^I shall validate shopping cart as below using Maps$")
    public void iShallValidateShoppingCartAsBelowUsingMaps(DataTable dataTable) {
        //convert data table to map, this map will return a list of map (of string as key and string as value)
        List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < userList.size(); i++) {
            new ShoppingCartPage().clickOnShoppingCart();
            //from row 0 get values of keys called name, model and quantity
            new ShoppingCartPage().verifyShoppingCart(userList.get(i).get("name"), userList.get(i).get("model"), userList.get(i).get("quantity"));
        }
    }

    @And("^I add below product to cart using List of List of Strings$")
    public void iAddBelowProductToCartUsingListOfListOfStrings(DataTable dataTable) {
        List<List<String>> products = dataTable.asLists(String.class);
        for (List<String> e : products.subList(1, products.size())) {//first index inclusive, last exclusive (1, 3)
            System.out.println(e);
        }
    }

    @Then("^I shall validate shopping cart as below using List of List of Strings$")
    public void iShallValidateShoppingCartAsBelowUsingListOfListOfStrings() {
    }

    @Then("^I shall be able to Buy the product$")
    public void iShallBeAbleToBuyTheProduct() {
        new ShoppingCartPage().clickOnCheckoutButton();
        new ShoppingCartPage().clickOnCheckoutButtonOnAddressPage();
        new ShoppingCartPage().clickOnTermsAndConditionsBoxOnShippingPage();
        new ShoppingCartPage().clickOnCheckoutButtonShippingPage();
        new ShoppingCartPage().clickOnPayByCheckOption();
        new ShoppingCartPage().clickOnIConfirmMyOrder();
    }

    @And("^I shall be able to Buy using cheque payment$")
    public void iShallBeAbleToBuyUsingChequePayment() {
        new ShoppingCartPage().verifyOrderIsCompleteByUsingCheckPaymentOption("Your order on My Store is complete.");
    }

    @And("^I am on the contact page$")
    public void iAmOnTheContactPage() {
        new MyAccountPage().selectMenuFromInformationFooter("Contact us");
        new MyAccountPage().verifyContactPageText("CUSTOMER SERVICE - CONTACT US");
    }

    @Then("^I send refund request to customer care for previous order$")
    public void iSendRefundRequestToCustomerCareForPreviousOrder() {
        new ContactPage().chooseASubjectHeading("Customer service");
        new ContactPage().chooseAnOrderReference();
        new ContactPage().chooseAProductFromDropdown();
        new ContactPage().fileUpload("C:\\Users\\Kinjal\\Desktop\\TestDoc.docx");
        new ContactPage().inputMessage("Please process a refund");
        new ContactPage().clickOnSendButton();

    }

}
