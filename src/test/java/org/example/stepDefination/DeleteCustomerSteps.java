package org.example.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ActionElement.DeleteCustomerActions;
import org.example.ActionElement.EditCustomerActions;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerSteps {

    WebDriver driver;
    DeleteCustomerActions deleteCustomerActions;

    public DeleteCustomerSteps(CommonSteps commonSteps, DeleteCustomerActions deleteCustomerActions) throws InterruptedException {
        this.driver = commonSteps.getDriver();
        this.deleteCustomerActions = deleteCustomerActions;

}
    @Given("Search the url in the browser")
    public void search_the_url_in_the_browser() {
        driver.get("https://demo.guru99.com/V2/webpages/DeleteCustomerInput.php");

    }

    @When("Enter the customer id {string} and click on submit")
    public void enter_the_customer_id_and_click_on_submit(String CustomerID) {
        deleteCustomerActions.custidd(CustomerID);
        deleteCustomerActions.submitStackHolderIDt();
          }

    @Then("Customer id Submition Successful")
    public void customer_id_submition_successful() {
        System.out.println("Customer id Submition Successful");
    }




}
