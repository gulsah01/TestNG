package tests.testNGFramework_JUnit;

import org.testng.annotations.Test;
import pages.WebUniPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class tekrar {
    @Test
    public void iFrameTest01(){
//1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("webUniUrl"));

//2.“Our Products” butonuna basin
        WebUniPage webUniPage=new WebUniPage();
        // click yapmak istedigimiz our product linki bir iframe icinde
        Driver.getDriver().switchTo().frame(webUniPage.iFrameElementi);
    ReusableMethods.bekle(2);

//3.“Cameras product”i tiklayin
webUniPage.camerasElementi.click();
//4.Popup mesajini yazdirin
        System.out.println(webUniPage.popUpMesaji.getText());
//5.“close” butonuna basin
webUniPage.alertKapatButonu.click();
//6.“WebdriverUniversity.com (IFrame)” linkini tiklayin
        Driver.getDriver().switchTo().defaultContent();
webUniPage.webDriverLinki.click();
//7.“http://webdriveruniversity.com/index.html” adresine gittigini test edin
        ReusableMethods.bekle(2);
        Driver.closeDriver();
    }
}
