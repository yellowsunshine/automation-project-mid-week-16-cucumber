$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshopping.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7194110600,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "TC-003 Add product to Online Cart and checkout using Maps",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-003-add-product-to-online-cart-and-checkout-using-maps",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Sample"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I add below product to cart using Maps",
  "rows": [
    {
      "cells": [
        "category",
        "subCategory",
        "name",
        "model",
        "quantity"
      ],
      "line": 36
    },
    {
      "cells": [
        "Dresses",
        "CASUAL DRESSES",
        "Printed Dress",
        "demo_3",
        "2"
      ],
      "line": 37
    },
    {
      "cells": [
        "Women",
        "TOPS",
        "Faded Short Sleeve T-shirts",
        "demo_1",
        "3"
      ],
      "line": 38
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I shall validate shopping cart as below using Maps",
  "rows": [
    {
      "cells": [
        "name",
        "model",
        "quantity"
      ],
      "line": 40
    },
    {
      "cells": [
        "Printed Dress",
        "SKU : demo_3",
        "2"
      ],
      "line": 41
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts",
        "SKU : demo_1",
        "3"
      ],
      "line": 42
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "I shall be able to Buy the product",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "I shall be able to Buy using cheque payment",
  "keyword": "And "
});
formatter.match({
  "location": "OnlineShoppingSteps.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 1579832200,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 1569189000,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.iAddBelowProductToCartUsingMaps(DataTable)"
});
formatter.result({
  "duration": 14249739500,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.iShallValidateShoppingCartAsBelowUsingMaps(DataTable)"
});
formatter.result({
  "duration": 4166018500,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.iShallBeAbleToBuyTheProduct()"
});
formatter.result({
  "duration": 7312442900,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.iShallBeAbleToBuyUsingChequePayment()"
});
formatter.result({
  "duration": 59671500,
  "status": "passed"
});
formatter.after({
  "duration": 95700,
  "status": "passed"
});
});