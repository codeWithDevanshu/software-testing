package org.example.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ActionElement.EditCustomerActions;
import org.example.ActionElement.LoginActions;
import org.openqa.selenium.WebDriver;

public class EditCustomerSteps {
    WebDriver driver;
            EditCustomerActions editCustomerActions;

    public EditCustomerSteps(CommonSteps commonSteps,EditCustomerActions editCustomerActions) throws InterruptedException {
        this.driver = commonSteps.getDriver();
        this.editCustomerActions = editCustomerActions;

    }
    @Given("enter the URL into the browser")
    public void enter_the_url_into_the_browser() {
    driver.get("https://demo.guru99.com/V2/webpages/EditCustomer.php");
    }

    @When("enter customer id {string} and click submit button")
    public void enter_customer_id_and_click_submit_button(String CustomerID) {
        editCustomerActions.
        editCustomerActions.custidSubmit();

    }

    @Then("id Submitted")
    public void id_submitted() {
        System.out.println("id submitted");

    }












}
