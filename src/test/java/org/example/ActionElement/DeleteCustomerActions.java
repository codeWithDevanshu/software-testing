package org.example.ActionElement;

import org.example.pageElement.DeleteCustomerElements;
import org.example.pageElement.LoginElement;
import org.example.stepDefination.CommonSteps;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerActions {
    WebDriver driver;
    DeleteCustomerElements deleteCustomerElements;


    public DeleteCustomerActions(CommonSteps commonSteps) throws InterruptedException {

        this.driver = commonSteps.getDriver();
        this.deleteCustomerElements = new DeleteCustomerElements();}



    public void custidd(String Custidd) {
        deleteCustomerElements.StackHolderID.sendKeys(Custidd);
        }
        public void submitStackHolderIDt() {
            deleteCustomerElements.submitStackHolderID.submit();
    }

}


