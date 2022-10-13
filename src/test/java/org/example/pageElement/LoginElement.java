package org.example.pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElement {
    WebDriver driver;

@FindBy(css = "input[type='text']")
    public WebElement email;

@FindBy(css = "input[type='password']")
    public WebElement password;

@FindBy(css = "input[type='submit']")
    public WebElement clickButton;

@FindBy (css = "input[name='name']")
public WebElement CustomerName;

@FindBy(css = "input[type='radio']")
public WebElement SelectGender;

@FindBy(css = "input[type='date']")
public WebElement DOB;

    @FindBy(css = "textarea[rows='5']")
    public WebElement Add;

    @FindBy(css = "input[onkeyup='validateCity();']")
    public WebElement city;

    @FindBy(css = "input[onkeyup='validateState();']")
    public WebElement state;

    @FindBy(css = "input[onkeyup='validatePIN();']")
    public WebElement PIN;

    @FindBy(css = "input[onkeyup='validateTelephone();']")
    public WebElement  ContactNo;

    @FindBy(css = "input[onkeyup='validateEmail();']")
    public WebElement CustomerEmail;



    @FindBy(css = "input[type='submit']")
    public WebElement Submit;

//    @FindBy(css = "input[name=\"cusid\"]")
//    public WebElement CustomerID;
//
//    @FindBy(css = "input[name=\"AccSubmit\"]")
//    public WebElement submitCustomerID;


    public LoginElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }








}
