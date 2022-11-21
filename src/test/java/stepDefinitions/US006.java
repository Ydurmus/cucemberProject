package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaPages;
import utilities.ConfigReader;

public class US006 {
    MedunnaPages medunnaPages = new MedunnaPages();

    @And("gecerli usurname ve password ile giriş yapar")
    public void gecerliUsurnameVePasswordIleGirisYapar() {
        medunnaPages.signinUsername.sendKeys(ConfigReader.getProperty("kullaniciUserName"));
        medunnaPages.signinPassword.sendKeys(ConfigReader.getProperty("kullaniciPassword"));
        medunnaPages.signInButton.click();
    }

    @And("sag ustte yer alan sigin in  butonuna ve settings e tiklar")
    public void sagUstteYerAlanSiginInButonunaVeSettingsETiklar() {
        medunnaPages.kullanicilogin.click();
        medunnaPages.kullaniciProfilSettings.click();
    }

    @Given("acilan sayfanin First name kisminda giriş yapılan First name'in yazdığı doğrulanır")
    public void acilanSayfaninFirstNameKismindaGirisYapilanFirstNameInYazdigiDogrulanir() {
        System.out.println(medunnaPages.hastaProfilSettingsFirstName.getAttribute("value"));
        Assert.assertEquals(ConfigReader.getProperty("kullaniciFirstName"), medunnaPages.hastaProfilSettingsFirstName.getAttribute("value"));
    }

    @Then("açılan sayfanın Last Name kısmında giriş yapılan Last name'in yazdığı doğrulanır")
    public void acilanSayfaninLastNameKismindaGirisYapilanLastNameInYazdigiDogrulanir() {
        Assert.assertEquals(ConfigReader.getProperty("kullaniciLastName"), medunnaPages.hastaProfilSettingsLastName.getAttribute("value"));

    }

    @Then("açılan sayfanın Email kısmında giriş yapılan Email'in yazdığı doğrulanır")
    public void acilanSayfaninEmailKismindaGirisYapilanEmailInYazdigiDogrulanir() {
        Assert.assertEquals(ConfigReader.getProperty("kullaniciEmail"), medunnaPages.hastaProfilSettingsEmail.getAttribute("value"));

    }

    @And("açılan sayfayanın First Name kısmına Yeni bir First Name yazılır ve Save ikonuna tıklanır")
    public void acilanSayfayaninFirstNameKisminaYeniBirFirstNameYazilirVeSaveIkonunaTiklanir() {
        medunnaPages.hastaProfilSettingsFirstName.clear();
        medunnaPages.hastaProfilSettingsFirstName.sendKeys(Faker.instance().name().firstName());
        medunnaPages.hastaProfilSettingsSave.click();


    }


    @And("açılan sayfayanın Last Name kısmına Yeni bir Last Name yazılır ve Save ikonuna tıklanır")
    public void acilanSayfayaninLastNameKisminaYeniBirLastNameYazilirVeSaveIkonunaTiklanir() {
        medunnaPages.hastaProfilSettingsLastName.clear();
        medunnaPages.hastaProfilSettingsLastName.sendKeys(Faker.instance().name().lastName());
        medunnaPages.hastaProfilSettingsSave.click();

    }

    @And("açilan sayfayanin Email kismina Yeni bir Email yazilir ve Save ikonuna tiklanir")
    public void acilanSayfayaninEmailKisminaYeniBirEmailYazilirVeSaveIkonunaTiklanir() {
        medunnaPages.hastaProfilSettingsEmail.clear();
        medunnaPages.hastaProfilSettingsEmail.sendKeys(Faker.instance().internet().emailAddress());
        medunnaPages.hastaProfilSettingsSave.click();
    }

    @Then("Settings saved! yazisinin gorulduğu dogrulanir")
    public void settingsSavedYazisininGorulduguDogrulanir() {
        Assert.assertTrue(medunnaPages.settingsSaved.isDisplayed());
    }
}
