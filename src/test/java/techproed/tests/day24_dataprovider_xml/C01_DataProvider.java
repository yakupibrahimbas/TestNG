package techproed.tests.day24_dataprovider_xml;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.io.ObjectInputFilter;

public class C01_DataProvider {
    //Bir dataprovideri name parametresi ile ozellistirerek kullanimi
    @DataProvider(name = "googleUrunler")
    public static Object[][] urunler() {
        return new Object[][]{
                {"laptop"},{"iphone"},{"mouse"},{"keyboard"}
        };
    }

    @Test(dataProvider = "googleUrunler")
    public void test01(String data) {
        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        //DataProvider ile istediğimiz arac isimlerini aratalım
        GooglePage googlePage = new GooglePage();
        googlePage.aramaKutusu.sendKeys(data, Keys.ENTER);

        //sayfayı kapatalım
        Driver.closeDriver();
    }




    //DataProviderin ilk  kullanimi
    @DataProvider
    public static Object[][] amazonUrunler() {
        return new Object[][]{
                {"laptop"},{"iphone"},{"mouse"},{"keyboard"}
        };
    }

    @Test(dataProvider = "amazonUrunler")
    public void test02(String data) {

        //amazon sayfasına gidelim,
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //aramakutusunda dataprovider'dan gelen verileri aratalım
        AmazonPage amazonPage = new AmazonPage();

        try{
            amazonPage.handleCaptcha();
        } catch (Exception e) {
            //captcha sayfada cikmamasi durumunda nosuchelement exception i boylece ignore ettik
        }

        amazonPage.aramaKutusu.sendKeys(data,Keys.ENTER);

        //sayfayı kapatınız
        Driver.closeDriver();
    }


}