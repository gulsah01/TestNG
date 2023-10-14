package tests.practice;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P04 {
    //1- https://www.qualitydemy.com/ anasayfasina gidin
//2- login linkine basin
// 3- Kullanici email'i olarak valid email girin
// 4- Kullanici sifresi olarak valid sifre girin
// 5- Login butonuna basarak login olu
// 6- Basarili olarak giris yapilabildigini test edin

@Test
public void  QualityDemy(){
    Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

    QualitydemyPage qualitydemyPage =new QualitydemyPage();
    qualitydemyPage.ilkLoginLinki.click();
    qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));
    qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
    qualitydemyPage.cookiesElementi.click();
    ReusableMethods.bekle(4);
    qualitydemyPage.loginButonu.click();



}
}
