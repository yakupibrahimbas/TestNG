package techproed.tests.Subat17;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.tests.day21_softAssertion_pom.AmazonPage;
import techproed.utilities.Driver;

public class C1 {
    @Test
    public void test01() {
        //amazon gidilsin
        Driver.getDriver().get("https://amazon.com");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("selenium", Keys.ENTER);
    }
}
