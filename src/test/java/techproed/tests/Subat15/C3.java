package techproed.tests.Subat15;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C3 {
    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://facebook.com");
        Driver.getDriver().get("https://google.com");
        /*
        Driveri her cagirdigimizda yeni bir pencere acmamasi icin if blocku ile ayarlama yaptik
        if(driver==null) ile driver eger bos ise yani deger atanmamis ise driveri baslat dedik
        POM de driverin singelton Pattern ile kullanilmasi tercih edilmiştir.
        Singleton Pattern==> (tekli kullanim) bir classtan bir ozelligin
         */
    }
}
