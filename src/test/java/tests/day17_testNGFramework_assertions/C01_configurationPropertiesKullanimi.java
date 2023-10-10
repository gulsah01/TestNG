package tests.day17_testNGFramework_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_configurationPropertiesKullanimi {
    @Test
    public void test01(){
        // amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //parantezin icine  configuration.properties   dosyasindan amazonUrl'i
        //bana getirecek bir seyler yazmam lazim

        // arama kutusuna aranacak kelimeyi yazdirin ve aratin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramakutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        // arama sonuclarinin aranan kelimeyi icerdigini test edin
         String expectedIcerik =ConfigReader.getProperty("amazonAranacakKelime");
         String actulaAramaSonucu =amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actulaAramaSonucu.contains(expectedIcerik));
        
        // sayfayi kapatin
        ReusableMethods.bekle(2);
                  Driver.closeDriver();
    }
}
