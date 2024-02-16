package techproed.tests.Subat15;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class Amazon {
    /*
    alttaki kod bu classtaki ogeleri driver ile eslestirir, bu sayede classtaki webelementlere erismek icin @findBy gibi
     PageFactory e yardiimci notasyonlar kullanilabilir bir hale gelir
     */
    public Amazon() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;
}
