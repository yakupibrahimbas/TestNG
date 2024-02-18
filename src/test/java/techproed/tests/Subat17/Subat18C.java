package techproed.tests.Subat17;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;

public class Subat18C {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        BlueRentalPage blueRentalPage=new BlueRentalPage();
        blueRentalPage.loginButton.click();

    }
}
