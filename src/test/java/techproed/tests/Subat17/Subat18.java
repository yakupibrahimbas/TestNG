package techproed.tests.Subat17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Subat18 {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        BlueRentalPage blueRentalPage=new BlueRentalPage();
        blueRentalPage.loginButton.click();
        String fakeEmail= ConfigReader.getProperty("fakeEmail");
        String fakePassword= ConfigReader.getProperty("fakePassword");
        blueRentalPage.email.sendKeys(fakeEmail);
        blueRentalPage.password.sendKeys(fakePassword, Keys.ENTER);

        ReusableMethods.visibleWait(blueRentalPage.negativeloginVerify,15);
        Assert.assertTrue(blueRentalPage.negativeloginVerify.isDisplayed());

    }
}
