package tests.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AEPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P05 {
@Test
    public void AEtest(){
    Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
    AEPage aePage=new AEPage();
    aePage.signUp.click();
    aePage.registerName.sendKeys("Nese");
    aePage.registermail.sendKeys("neseligunler@gmail.com");
    aePage.signupButton.click();
    aePage.gender1.click();
    aePage.password.sendKeys("777");
    aePage.firstName.sendKeys("Mutlu");
    aePage.lastName.sendKeys("Cennet");
    aePage.address.sendKeys("Utopyalar dunyasi");
    Select select=new Select(aePage.country);
    select.selectByValue("Canada");
    aePage.state.sendKeys("Leeds");
    aePage.zipcode.sendKeys("520");
    aePage.mobileNumber.sendKeys("520 777"+ Keys.ENTER);
    aePage.city.sendKeys("Kirkstail");
    String expectedverify="ACCOUNT CREATED!";
    String actualVerify=aePage.regverify.getText();
    Assert.assertTrue(actualVerify.contains(expectedverify));

    Driver.closeDriver();


}
}
