package org.example.stepDefination;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ActionElement.LoginActions;
import org.openqa.selenium.WebDriver;
public class LoginSteps {
    WebDriver driver;
    LoginActions loginActions;


    public LoginSteps(CommonSteps commonSteps, LoginActions loginAction) throws InterruptedException {
        this.driver = commonSteps.getDriver();
        this.loginActions=loginAction;
    }



    @Given("enter the url in the given browser")
    public void enter_the_url_in_the_given_browser() {
        driver.get("https://demo.guru99.com/V2/");

    }
    @When("the the valid username {string} and password {string} and click on the login button")
    public void the_the_valid_username_and_password_and_click_on_the_login_button(String username, String password) {
       loginActions.enterEmail(username);
       loginActions.enterPassword(password);
       loginActions.click();
    }
    @Then("login is successful")
    public void login_is_successful() {
        System.out.println("successful");

    }


    @Then("login is successful.")
    public void loginIsSuccessful() {
        System.out.println("success");
    }

    @And("Enter the url in the addCustomer page")
    public void enterTheUrlInTheAddCustomerPage() {
        driver.get("https://demo.guru99.com/V2/webpages/addcustomerpage.php");
    }

    @And("Enter customer name {string} and select the gender {string}")
    public void enterCustomerNameAndSelectTheGender(String name, String male) {
        loginActions.name(name);
        loginActions.gender(male);

    }
    @And("Select the Customer date of birth {string}")
    public void selectTheCustomerDateOfBirth(String DOB) {
        loginActions.dateOfBirth(DOB);

    }

    @And("fill up the address of customer {string}")
    public void fillUpTheAddressOfCustomer(String Address) {
        loginActions.address(Address);

    }

    @And("Enter customer city {string}")
    public void enterCustomerCity(String City) {
        loginActions.city(City);

    }

    @And("Customer State is {string}")
    public void customerStateIs(String State) {
        loginActions.state(State);

    }

    @And("Customer Area pin is {string}")
    public void customerAreaPinIs(String pinCode) {
        loginActions.pin(pinCode);

    }

    @And("Customer Mobile Number is {string}")
    public void customerMobileNumberIs(String ContactNumber) {
        loginActions.coNo(ContactNumber);

    }

    @And("Customer Mail id is {string}")
    public void customerMailIdIs(String Mailid) {
        loginActions.custEmail(Mailid);


    }

    @And("Click on submit button")
    public void clickOnSubmitButton() {
        loginActions.submit();
    }

    @And("customer information sumitted successful")
    public void customerInformationSumittedSuccessful() {
        System.out.println("customer information sumitted successful");
    }

    @And("Enter the edit customer field url in the browser")
    public void enterTheEditCustomerFieldUrlInTheBrowser() {
       driver.get("https://demo.guru99.com/V2/webpages/EditCustomer.php");
    }

    @And("drop the url in the browser")
    public void dropTheUrlInTheBrowser() {
        driver.get("https://demo.guru99.com/V2/webpages/EditCustomer.php");
    }

//    @And("Enter the Customer id in the box {string}")
//    public void enterTheCustomerIdInTheBox(String CustomerID) {
//        loginActions.custid(CustomerID);
//    }
//
//    @And("Click on the button submit")
//    public void clickOnTheButtonSubmit() {
//        loginActions.custidSubmit();
//    }
//
//    @Then("id is successfully Submitted")
//    public void idIsSuccessfullySubmitted() {
//        System.out.println("id is successfully Submitted");
//    }
}
