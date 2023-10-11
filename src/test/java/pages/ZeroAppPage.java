package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroAppPage {

    public ZeroAppPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="signin_button'")
    public WebElement ilkSignInButonu;


}