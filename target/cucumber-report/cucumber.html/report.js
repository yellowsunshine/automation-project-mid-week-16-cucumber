$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshopping.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 54834432200,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "TC-003 Add product to Online Cart and checkout using Maps",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-003-add-product-to-online-cart-and-checkout-using-maps",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@Postman"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "I add below product to cart using List of List of Strings",
  "rows": [
    {
      "cells": [
        "category",
        "subCategory",
        "name",
        "model",
        "quantity"
      ],
      "line": 51
    },
    {
      "cells": [
        "Dresses",
        "CASUAL DRESSES",
        "Printed Dress",
        "demo_3",
        "2"
      ],
      "line": 52
    },
    {
      "cells": [
        "Women",
        "TOPS",
        "Faded Short Sleeve T-shirts",
        "demo_1",
        "3"
      ],
      "line": 53
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I shall validate shopping cart as below using List of List of Strings",
  "rows": [
    {
      "cells": [
        "name",
        "model",
        "quantity"
      ],
      "line": 55
    },
    {
      "cells": [
        "Printed Dress",
        "SKU : demo_3",
        "2"
      ],
      "line": 56
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts",
        "SKU : demo_1",
        "3"
      ],
      "line": 57
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "I shall be able to Buy the product",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "I shall be able to Buy using cheque payment",
  "keyword": "And "
});
formatter.match({
  "location": "OnlineShoppingSteps.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 6139993900,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 4315644700,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.iAddBelowProductToCartUsingListOfListOfStrings(DataTable)"
});
formatter.result({
  "duration": 22089200,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingSteps.iShallValidateShoppingCartAsBelowUsingListOfListOfStrings()"
});
formatter.result({
  "duration": 1076300,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027com.automationpractice.cucumber.steps.OnlineShoppingSteps.iShallValidateShoppingCartAsBelowUsingListOfListOfStrings() in file:/C:/Users/Kinjal/IdeaProjects/Automation%20Week%2016-part2-cucumber/automation-project-mid-week-16-cucumber/target/test-classes/\u0027 with pattern [^I shall validate shopping cart as below using List of List of Strings$] is declared with 0 parameters. However, the gherkin step has 1 arguments [Table:[[name, model, quantity], [Printed Dress, SKU : demo_3, 2], [Faded Short Sleeve T-shirts, SKU : demo_1, 3]]]. \nStep: Then I shall validate shopping cart as below using List of List of Strings\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OnlineShoppingSteps.iShallBeAbleToBuyTheProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OnlineShoppingSteps.iShallBeAbleToBuyUsingChequePayment()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1257124600,
  "status": "passed"
});
});