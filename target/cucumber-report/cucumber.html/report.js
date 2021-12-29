$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshopping.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19738134300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "TC-001 Create New User/SignUp",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-001-create-new-user/signup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to SignUp page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "create an account with random username",
  "rows": [
    {
      "cells": [
        "James",
        "Bond",
        "abc12456",
        "123 Abc Street",
        "London",
        "Florida",
        "12345",
        "01234567890"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "OnlineShoppingSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 164414500,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.navigateToSignUpPage()"
});
formatter.result({
  "duration": 5763143800,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.createAnAccountWithRandomUsername(DataTable)"
});
formatter.result({
  "duration": 20113384900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#email_create\"}\n  (Session info: chrome\u003d96.0.4664.110)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027KEYKIN1\u0027, ip: \u0027192.168.68.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [baf48a76d4edaeb3f8996bf206efaaf4, findElement {using\u003did, value\u003demail_create}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.110, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\Kinjal\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:63284}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63284/devtoo..., se:cdpVersion: 96.0.4664.110, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: baf48a76d4edaeb3f8996bf206efaaf4\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:66)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy25.sendKeys(Unknown Source)\r\n\tat com.automationpractice.utility.Utility.pmSendTextToElement(Utility.java:56)\r\n\tat com.automationpractice.pages.AuthenticationPage.enterEmailInTheEmailAddressField(AuthenticationPage.java:43)\r\n\tat com.automationpractice.cucumber.steps.OnlineShoppingSteps.createAnAccountWithRandomUsername(OnlineShoppingSteps.java:34)\r\n\tat ✽.And create an account with random username(onlineshopping.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 134736500,
  "status": "passed"
});
formatter.before({
  "duration": 11985643800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "TC-002 Sign In with newly created user credentials",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-002-sign-in-with-newly-created-user-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I shall verify the address information in my address section",
  "keyword": "Then "
});
formatter.match({
  "location": "OnlineShoppingSteps.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 15707414600,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 14505328500,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.iShallVerifyTheAddressInformationInMyAddressSection()"
});
formatter.result({
  "duration": 10338898300,
  "status": "passed"
});
formatter.after({
  "duration": 36100,
  "status": "passed"
});
formatter.before({
  "duration": 12552880200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "TC-003 Add product to Online Cart and checkout using Raw Table",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-003-add-product-to-online-cart-and-checkout-using-raw-table",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I add below product to cart",
  "rows": [
    {
      "cells": [
        "category",
        "subCategory",
        "name",
        "model",
        "quantity"
      ],
      "line": 21
    },
    {
      "cells": [
        "Dresses",
        "CASUAL DRESSES",
        "Printed Dress",
        "demo_3",
        "2"
      ],
      "line": 22
    },
    {
      "cells": [
        "Women",
        "TOPS",
        "Faded Short Sleeve T-shirts",
        "demo_1",
        "3"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I shall validate shopping cart as below",
  "rows": [
    {
      "cells": [
        "name",
        "model",
        "quantity"
      ],
      "line": 25
    },
    {
      "cells": [
        "Printed Dress",
        "SKU : demo_3",
        "2"
      ],
      "line": 26
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts",
        "SKU : demo_1",
        "3"
      ],
      "line": 27
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I shall be able to Buy the product",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I shall be able to Buy using cheque payment",
  "keyword": "And "
});
formatter.match({
  "location": "OnlineShoppingSteps.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 13013959400,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 13267798900,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.iAddBelowProductToCart(DataTable)"
});
