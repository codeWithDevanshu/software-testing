package org.example.ActionElement;

import org.checkerframework.checker.units.qual.C;
import org.example.pageElement.LoginElement;
import org.example.stepDefination.CommonSteps;
import org.openqa.selenium.WebDriver;

public class LoginActions {
    WebDriver driver;
    LoginElement loginElement;

    public LoginActions(CommonSteps commonSteps) throws InterruptedException {

        this.driver = commonSteps.getDriver();
        this.loginElement = new LoginElement(driver);
    }

    public void enterEmail(String email) {
        loginElement.email.sendKeys(email);
    }

    public void enterPassword(String password) {
        loginElement.password.sendKeys(password);

    }

    public void click() {
        loginElement.clickButton.click();
    }

    public void name(String Name) {
        loginElement.CustomerName.sendKeys(Name);
    }

    public void gender(String male) {
        loginElement.SelectGender.sendKeys(male);
    }

    public void dateOfBirth(String DOB) {
        loginElement.DOB.sendKeys(DOB);
    }

    public void address(String Add) {
        loginElement.Add.sendKeys(Add);

    }

    public void city(String City) {
        loginElement.city.sendKeys(City);

    }

    public void state(String state) {
        loginElement.state.sendKeys(state);
    }

    public void pin(String Pin) {
        loginElement.PIN.sendKeys(Pin);
    }

    public void coNo(String CONO) {
        loginElement.ContactNo.sendKeys(CONO);
    }

    public void custEmail(String CustEmail) {
        loginElement.CustomerEmail.sendKeys(CustEmail);
    }


    public void submit() {
        loginElement.Submit.click();
    }}
//    public void custid(String Custid) {
//        loginElement.CustomerEmail.sendKeys(Custid);
//}
//    public void custidSubmit() {
//        loginElement.CustomerEmail.click();}}







