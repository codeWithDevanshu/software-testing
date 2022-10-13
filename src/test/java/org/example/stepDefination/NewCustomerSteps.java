package org.example.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ActionElement.LoginActions;
import org.example.ActionElement.NewCustomerActions;
import org.openqa.selenium.WebDriver;

public class NewCustomerSteps {
    WebDriver driver;
    NewCustomerActions newCustomerActions;


    public NewCustomerSteps(CommonSteps commonSteps, NewCustomerActions newCustomerActions) throws InterruptedException {
        this.driver = commonSteps.getDriver();
        this.newCustomerActions=newCustomerActions;
}


    @Given("Enter url")
    public void enter_url() {
       driver.get("https://demo.guru99.com/V2/webpages/addAccount.php");
    }

    @When("Enter Cusromer id {string} and Account type {string} and initial deposit is {string} and click on submit")
    public void enter_cusromer_id_and_account_type_and_initial_deposit_is_and_click_on_submit(String Customerid, String accountType, String initialDeposit) {
        newCustomerActions.customerid(Customerid);
        newCustomerActions.accountType(accountType);
        newCustomerActions.initialDeposit(initialDeposit);
        newCustomerActions.press();

    }

    @Then("Submitted")
    public void submitted() {
        System.out.println("Submitted");
    }



}
