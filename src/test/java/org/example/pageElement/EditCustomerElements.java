package org.example.pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerElements {
    WebDriver driver;
    @FindBy(css = "input[name=\"cusid\"]")
   public WebElement CustomerID;

    @FindBy(css = "input[name=\"AccSubmit\"]")
    public WebElement submitCustomerID;


    public EditCustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);



}}