package tests.testNGFramework_JUnit;

import org.checkerframework.checker.units.qual.K;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuAppPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_HerokuApp {
    @Test
    public void herokuApp(){
           // 1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
            Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
        HerOkuAppPage herOkuAppPage=new HerOkuAppPage();
            // 2 ) - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
        Assert.assertTrue(herOkuAppPage.iFrameYaziElementi.isEnabled());
        System.out.println(herOkuAppPage.iFrameYaziElementi.getText());

            // Arama Kutusuna Merhaba Dunya yazdirin.
     Driver.getDriver().switchTo().frame(herOkuAppPage.iframe);
    herOkuAppPage.textBox.clear();
    herOkuAppPage.textBox.sendKeys("Merhaba Dunya");
        ReusableMethods.bekle(2);
        herOkuAppPage.textBox.clear();
        herOkuAppPage.textBox.sendKeys("Hayat cok guzel");
        ReusableMethods.bekle(2);
            //  - TextBox’in altinda bulunan “Elemental Selenium”
            //    linkini textinin gorunur oldugunu dogrulayin ve konsolda yazdirin.
            //iframe'e gecen driver'i yeniden anasayfaya dondurmemiz gerekir

        Driver.getDriver().switchTo().defaultContent();
       Assert.assertTrue(herOkuAppPage.elementalLinki.isDisplayed());
        System.out.println(herOkuAppPage.elementalLinki.getText());
        Driver.closeDriver();
        }



}
