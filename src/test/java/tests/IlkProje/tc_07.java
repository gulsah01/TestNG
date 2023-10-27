package tests.IlkProje;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class tc_07 {
@Test
    public void US07_TC01(){
    //1- Browser'a https://qa.smartcardlink.com/ yazilir.
    Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

    //2-Header kismindaki sign in butonuna tiklanir.

    //3-Gecerli e-mail ve gecerli password girilir.

    //4-Login butonuna tiklanir.
    //5-Acilan sayfada dashboard bolumunun goruntulenebilir oldugu dogrulanir.
    //
    //6-VCards,Enguiries,Appointments,Vitual Backrounds,Settings ogelerinin ulasilabilir oldugu dogrulanir ve test edilir.
    //
    //7-Sayfa kapatilir
}
}
