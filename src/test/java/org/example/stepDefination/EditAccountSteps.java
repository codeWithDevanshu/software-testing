package org.example.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.ActionElement.EditAccountActions;
import org.example.ActionElement.LoginActions;
import org.openqa.selenium.WebDriver;

public class EditAccountSteps {
    WebDriver driver;
   EditAccountActions editAccountSteps;


    public EditAccountSteps(CommonSteps commonSteps, EditAccountActions editAccountActions) throws InterruptedException {
        this.driver = commonSteps.getDriver();
        this.editAccountSteps=editAccountActions;


}
    @Given("url enter")
    public void url_enter() {
        driver.get("https://demo.guru99.com/V2/webpages/editAccount.php");

    }

    @Then("Enter Account Number {string} and click")
    public void enter_account_number_and_click(String Accountno) {





    }}
