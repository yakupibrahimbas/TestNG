package techproed.tests.day22_pom;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.tests.day21_softAssertion_pom.AmazonPage;
import techproed.utilities.Driver;

public class C01_PageKullanimi {
    @Test
    public void test01() {
        //amazon sayfasina gidelim
        Driver.getDriver().get("https://amazon.com");

        //arama kutusunda selenium aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("selenium", Keys.ENTER);

    }
}