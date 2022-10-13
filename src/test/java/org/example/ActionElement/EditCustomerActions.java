package org.example.ActionElement;

import org.example.pageElement.EditCustomerElements;
import org.example.pageElement.LoginElement;
import org.example.stepDefination.CommonSteps;
import org.openqa.selenium.WebDriver;

public class EditCustomerActions {
    public EditCustomerActions editCustomerActions;
    WebDriver driver;

  EditCustomerElements editCustomerElements;

    public EditCustomerActions(CommonSteps commonSteps) throws InterruptedException {

        this.driver = commonSteps.getDriver();
        this.editCustomerElements = new EditCustomerElements(driver);

    }
        public void custid(String Custid) {
      editCustomerElements.CustomerID.sendKeys(Custid);
}
    public void custidSubmit() {
        editCustomerElements.submitCustomerID.click();}
        }
