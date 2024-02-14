package techproed.tests.Subat14;

import org.testng.annotations.*;

public class C1 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Herseyden once BeforeSuite notasyonuna sahip method 1 kez calisir");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Herseyden sonra AfterSuite notasyonuna sahip method 1 kez calisir");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Testlerden once BeforeTest notasyonuna sahip method 1 kez calisir");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Testlerden sonra AfterTest notasyonuna sahip method 1 kez calisir");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Her classtan once BeforeClass notasyonuna  sahip method 1 kez calisir");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Her classtan sonra AfterClass notasyonuna sahip method 1 kez calisir");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod notasyonuna sahip method her test methodundan once 1 kez calisir");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod notasyonuna sahip method her test methodundan sonra 1 kez calisir");
    }

    @Test
    public void test01() {
        System.out.println("Test01 calisti");
    }
    @Test
    public void test02() {
        System.out.println("Test02 calisti");
    }
}