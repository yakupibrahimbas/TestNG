package techproed.tests.day20_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class C05_DependsOnMethods {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() {
        //amazona gidelim
        driver.get("https://amazon.com");

        //arama kutusunda selenium aratalim
        WebElement aramaKutusu = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        aramaKutusu.sendKeys("selenium", Keys.ENTER);
        Assert.assertTrue(false);//dependsOnMethods sadece bagli oldudgu testin sonucu pass olursa calisir
        //fail olursa hic calismaz (ignore)
    }

    @Test(dependsOnMethods = "test01")
    public void test02() throws InterruptedException {
        Thread.sleep(3000);
        //sonuc yazisinin selenium icerdigini test edelim
        String sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]")).getText();
        Assert.assertTrue(sonucYazisi.contains("selenium"));
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}