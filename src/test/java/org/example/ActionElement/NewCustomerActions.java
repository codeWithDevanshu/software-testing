package org.example.ActionElement;

import org.example.pageElement.LoginElement;
import org.example.pageElement.NewCustomerElements;
import org.example.stepDefination.CommonSteps;
import org.openqa.selenium.WebDriver;

public class NewCustomerActions {
    WebDriver driver;
    NewCustomerElements newCustomerElements;

    public NewCustomerActions(CommonSteps commonSteps) throws InterruptedException {

        this.driver = commonSteps.getDriver();
        this.newCustomerElements = new NewCustomerElements(driver);
    }
    public void customerid(String Customerid) {
        newCustomerElements.CUSTOMERID.sendKeys(Customerid);
    }
    public void accountType(String AccountType) {
       newCustomerElements.ACCOTYPE.sendKeys(AccountType);
    }

    public void initialDeposit(String InitialDeposit) {
        newCustomerElements.INITIALDEPOSIT.sendKeys(InitialDeposit);

}
    public void press() {
        newCustomerElements.PRESS.click();

}}