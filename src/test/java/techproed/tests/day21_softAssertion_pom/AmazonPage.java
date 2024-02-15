package techproed.tests.day21_softAssertion_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AmazonPage {
    /*
    pageFActory.initElements(Driver.getDriver().this); kodu bu classtaki
    ogeleri driver ile eslestirir, bu sayede classtaki webelementlere erismek icin @findNy gibi PageFactory'e yardimci notasyonlar kullanilabilir bir hale gelir
     */
    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(tagName = "twotabsearchtextbox")
    public WebElement aramaKutusu;
}
