package techproed.tests.day21_softAssertion_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C01_SoftAssertion {
    @Test
    public void softAssertion() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(12,2);
        softAssert.assertTrue(3>12);
        softAssert.assertFalse(12>3);
        softAssert.assertNotEquals("java","java");
        softAssert.assertAll();
        System.out.println("assertAll dan onceki test methodlarinda fail varsa bu kod calismaz");
        /*
        SoftAssert un hata bulsa bile calismaya devam etme ozellligi assertAll()methoduna kadardir
        Eger assertAll()da failed rapor edilirse calisma durdurulur
        yani assertAll hard Assertiondaki her bir assert gibi calisir
        hatayi yakalarsa calisma durur
         */

    }

    @Test
    public void hardAssertion() {
        System.out.println("hard assertion");
        Assert.assertTrue(true);
        Assert.assertFalse(true);
        Assert.assertEquals(2,3);
        System.out.println("hard assertionda ilk failde calisma durdurulur");
    }
}
