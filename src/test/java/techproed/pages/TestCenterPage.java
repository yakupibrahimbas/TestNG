package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestCenterPage {
    public TestCenterPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#exampleInputEmail1")
    public WebElement username;

    @FindBy(id = "exampleInputPassword1")
    public WebElement password;

    @FindBy(xpath = "//button")
    public WebElement submitButton;

    @FindBy(xpath = "//i[.=' Logout']")
    public WebElement logout;

}