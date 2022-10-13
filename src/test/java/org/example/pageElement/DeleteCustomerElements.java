package org.example.pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerElements {

    WebDriver driver;
    @FindBy(css = "input[type='text']")
   public WebElement StackHolderID;

    @FindBy(css = "input[type='submit']")
    public WebElement submitStackHolderID;

    public DeleteCustomerElements() {
        this.driver = driver;
        PageFactory.initElements(driver,this);

}}
