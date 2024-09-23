package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.Setup;

public class DashboardPage {
    @FindBy(id = "logout")
    WebElement logout;

    public DashboardPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void userInDashboard(){
        Assert.assertEquals(logout.getText(),"Logout");
    }
}
