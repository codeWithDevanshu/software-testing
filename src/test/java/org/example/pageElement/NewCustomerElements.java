package org.example.pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerElements {
    WebDriver driver;

    @FindBy(css = "input[onkeyup=\"validatecustomerid();\"]")
    public WebElement CUSTOMERID;

    @FindBy(css = "select[name=\"selaccount\"]")
    public WebElement ACCOTYPE;

    @FindBy(css = "input[name=\"inideposit\"]")
    public WebElement INITIALDEPOSIT;

    @FindBy(css = "input[name=\"button2\"]")
    public  WebElement PRESS;


    public NewCustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}