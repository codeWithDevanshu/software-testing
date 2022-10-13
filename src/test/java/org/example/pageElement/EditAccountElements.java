package org.example.pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountElements {
    WebDriver driver;

    @FindBy(css = "input[onkeyup=\"validateaccountno();\"]")
    public WebElement ACCOUNTNO;

    @FindBy(css = "input[name='AccSubmit']")
    public WebElement PUSH;

    public EditAccountElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
