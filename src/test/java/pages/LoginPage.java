package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy (id = "email")
    WebElement emailField;

    @FindBy (id= "password")
    WebElement passwordField;

    @FindBy (id = "submit")
    WebElement submitButton;

    @FindBy (xpath = "//*[contains(text(),'Incorrect username or password')]")
    WebElement errorMessage;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        submitButton.click();

    }

    public void assertingErrorMessage(){
        Assert.assertTrue(errorMessage.getText().contains("Incorrect username or password"));
    }
}
