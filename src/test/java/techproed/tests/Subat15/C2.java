package techproed.tests.Subat15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C2 {
    @Test
    public void test01() {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains("Amazon"));
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
       softAssert.assertTrue(aramaKutusu.isEnabled());
       aramaKutusu.sendKeys("selenium"+ Keys.ENTER);
       WebElement sonucYazisiWebElementi=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
       softAssert.assertTrue(sonucYazisiWebElementi.isDisplayed());
       softAssert.assertTrue(sonucYazisiWebElementi.getText().contains("selenium"));
       softAssert.assertAll();


    }

}
