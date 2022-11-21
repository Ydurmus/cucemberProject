package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.MedunnaPages;
import utilities.ConfigReader;

public class US004 {


 MedunnaPages medunnaPages= new MedunnaPages();
    @When("Kullanici sayfada sag uste bulunan kisi iconuna tiklar ve sign in ve register sekmesi acilir.")
    public void kullanici_sayfada_sag_uste_bulunan_kisi_iconuna_tiklar_ve_sign_in_ve_register_sekmesi_acilir() {
       medunnaPages.login.click();


    }

    @When("Kullanici sign in sekmesine basar.")
    public void kullanici_sign_in_sekmesine_basar() {
        medunnaPages.logSignin.click();

    }

    @When("Acılan ktucukta Username bolumune gecerli bir username girer.")
    public void acilan_kutucukta_username_bolumune_gecerli_bir_username_girer() {
        medunnaPages.signinUsername.sendKeys(ConfigReader.getProperty("gecerliUsername"));


    }

    @When("Acılan kutucukta Password bolumune gecerli bir password sifresi girer.")
    public void acilan_kutucukta_password_bolumune_gecerli_bir_password_sifresi_girer() {
        medunnaPages.signinPassword.sendKeys(ConfigReader.getProperty("gecerliPassword"));


    }

    @Then("Kullanicinin giriş yapabildiği test edilir.")
    public void kullanicinin_giris_yapabildigi_test_edilir() {

        medunnaPages.signInButton.click();
        Assert.assertTrue(medunnaPages.wellcomeToMedunnaText.isDisplayed());
    }

    @When("User name kısmına gecersiz bir ifade girer")
    public void user_name_kismina_gecersiz_bir_usurname_girer() {
        medunnaPages.signinUsername.sendKeys(ConfigReader.getProperty("gecersizUsername"));


    }

    @When("Sifre kısmına geçerli bir sifre girer")
    public void sifre_kismina_gecerli_bir_sifre_girer() {
        medunnaPages.signinPassword.sendKeys(ConfigReader.getProperty("gecerliPassword"));


    }


    @Then("Failed to sign in! Please check your credentials and try again. yazisinin gorur ve giris yapamaz.")
    public void failed_to_sign_in_please_check_your_credentials_and_try_again_yazisinin_gorur_ve_giris_yapamaz() {
     Assert.assertTrue(medunnaPages.SigningirisYapilamadi.isDisplayed());
    }


    @When("Sifre kısmına gecersiz bir sifre girer")
    public void sifre_kismine_gecersiz_bir_sifre_girer() {
       medunnaPages.signinPassword.sendKeys(ConfigReader.getProperty("gecersizPassword"));

    }

    @When("Sign in butonuna tıklar")
    public void sign_in_butonuna_tiklar() {
       medunnaPages.signInButton.click();


    }


    @Then("Acılan kutucukta Remember me secenegi oldugu dogrulanir.")
    public void acilan_kutucukta_remember_me_secenegi_oldugu_dogrulanir() {
       Assert.assertTrue(medunnaPages.rememberme.isDisplayed());

    }


    @Then("Acılan kutucukta Did you forget your password? secenegi oldugu dogrulanir.")
    public void acilan_kutucukta_did_you_forget_your_password_secenegi_oldugu_dogrulanir() {
       Assert.assertTrue(medunnaPages.forgetpassword.isDisplayed());

    }


    @Then("Acilan kutucukta You don't have an account yet? Register a new account secenegi oldugu test edilir.")
    public void acilan_kutucukta_you_don_t_have_an_account_yet_register_a_new_account_secenegi_oldugu_test_edilir() {

       Assert.assertTrue(medunnaPages.donthave.isDisplayed());
    }


    @Then("Acılan kutucukta Cancel  secenegi oldugu test edilir")
    public void acilan_kutucukta_cancel_secenegi_oldugu_test_edilir() {
       Assert.assertTrue(medunnaPages.cancel.isDisplayed());

    }

   @And("sayfa {int} saniye bekletilir.")
   public void sayfaSaniyeBekletilir(int saniye) {
      try {
         Thread.sleep(saniye*1000);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      } 
   }
}
