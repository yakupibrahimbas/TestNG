package techproed.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    private Driver() {
        /*
        P.O.Modelde driverim singleton pattern ile kullanilmasi tercih edilmiştir
        Singleton Pattern==> tekli kullanim bir classtan bir ozelligin object olusturularak
        kullanilmasini engellemek icin kullanilir
         */
    }

    static WebDriver driver;
    /*
    Driveri her cagirdigimizda yeni bir pencere acmamasi icin if blocku ile ayarlama yaptik
    if(driver==null) ile driver eger bos ise yani deger atanmamis ise driveri baslat dedik
    driver acikken deger atanmis olacagi icin bu block aktive olmayacak dolayisiyla mevcut driveri return
    edecek. boylece ayni driver uzerinden test senaryolarina devam edebilecegiz. Tekli kullanim icin default constructoru private yaptik
     */
   public static WebDriver getDriver(){
       if (driver==null){
           driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       }
       return driver;
   }
   public static void closeDriver(){
       if (driver!=null){
           driver.close();
           driver=null;
       }

   }

}
