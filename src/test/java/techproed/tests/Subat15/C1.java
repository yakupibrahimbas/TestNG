package techproed.tests.Subat15;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C1 {
    @Test
    public void softAssertion() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(12,2);
        softAssert.assertTrue(3>12);
        softAssert.assertFalse(4>3);
        softAssert.assertNotEquals("selenium","selenium");
        softAssert.assertAll();
        System.out.println("assertAlldan onceki test methodlarinda fail varsa bu caismayi durdurmaz");
        /*
        softAssert in hata bulsa bile calismaya devam etme ozelligi assertAll()methoduna ..
        eger assertAl()da failed rapor edilirse calisma durdurulur

         */
    }
 //eger hard assertion kullaniyorsak ilk failde testimiz durdurulur
    @Test
    public void hardAssertion() {
        System.out.println("hard asserrtion");
        Assert.assertEquals(2,3);
        System.out.println("hard assertionda ilk failde calisma durur");
    }
}
