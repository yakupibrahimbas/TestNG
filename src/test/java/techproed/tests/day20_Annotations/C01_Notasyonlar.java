package techproed.tests.day20_Annotations;

import org.testng.annotations.*;

public class C01_Notasyonlar {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Her şeyden önce BeforeSuite notasyonuna sahip method 1 kez çalışır");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Her şeyden sonra AfterSuite notasyonuna sahip method 1 kez çalışır");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Testlerden önce BeforeTest notasyonuna sahip method 1 kez çalışır");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Testlerden sonra AfterTest notasyonuna sahip method 1 kez çalışır");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Her class'tan önce BeforeClass notasyonuna sahip method 1 kez çalışır");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Her class'tan sonra AfterClass notasyonuna sahip method 1 kez çalışır");
    }

    @BeforeMethod
    public void beforeMethof() {
        System.out.println("BeforeMethod notasyonuna sahip method, her test methodundan önce 1 kez çalışır");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod notasyonuna sahip method, her test methodundan sonra 1 kez çalışır");
    }

    @Test(groups = "smoke")
    public void Test01() {
        System.out.println("Test01 calisti");
    }
    @Test
    public void Test02() {
        System.out.println("Test02 calisti");
    }
    @Test
    public void Test03() {
        System.out.println("Test03 calisti");
    }
}
