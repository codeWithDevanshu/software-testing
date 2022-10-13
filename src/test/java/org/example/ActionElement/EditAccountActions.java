package org.example.ActionElement;

import org.example.pageElement.EditAccountElements;
import org.example.pageElement.LoginElement;
import org.example.stepDefination.CommonSteps;
import org.openqa.selenium.WebDriver;

public class EditAccountActions {
    WebDriver driver;

    EditAccountElements editAccountElements;

    public  EditAccountActions(CommonSteps commonSteps) throws InterruptedException {

        this.driver = commonSteps.getDriver();
        this.editAccountElements = new EditAccountElements(driver);}

        public void accountNumber(String accountNumber) {
            editAccountElements.ACCOUNTNO.sendKeys(accountNumber);
        }

        public void push() {
           editAccountElements.PUSH.click();

}
}
