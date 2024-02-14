package techproed.tests.Subat14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C2 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() {
        driver.get("https://amazon.com");
    }

    @Test
    public void test02() {
        driver.get("https://facebook.com");
    }

    @Test
    public void test03() {
        driver.get("https://google.com");
    }
}
