package techproed.tests.Subat17;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C02 {
    public C02() {
    }

    @Test
    public void C02() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@name='username']")
    public WebElement userName;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//button")
    public WebElement loginButton;



}
