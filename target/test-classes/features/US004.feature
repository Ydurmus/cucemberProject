@US04
Feature:US04 Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır.

  Background: ortak adimlar
    Given Kullanici belirtilen medunnaUrl'e gider.
    And sayfa 3 saniye bekletilir.
    When Kullanici sayfada sag uste bulunan kisi iconuna tiklar ve sign in ve register sekmesi acilir.
    And Kullanici sign in sekmesine basar.
    And sayfa 3 saniye bekletilir.

  Scenario: TC01 Giris yapmak icin basarı mesajini doğrulayan, gecerli bir kullanici  adi ve sifre olmalidir.

    And Acılan ktucukta Username bolumune gecerli bir username girer.
    And Acılan kutucukta Password bolumune gecerli bir password sifresi girer.
    Then Kullanicinin giriş yapabildiği test edilir.
    And Sayfa kapatilir.

  Scenario: TC02 Giris yapmak için gecersiz bir kullanici adi, gecerli sifre ile giris  yapilamamalidir.
    And User name kısmına gecersiz bir ifade girer
    And Sifre kısmına geçerli bir sifre girer
    And Sign in butonuna tıklar
    And sayfa 1 saniye bekletilir.
    Then Failed to sign in! Please check your credentials and try again. yazisinin gorur ve giris yapamaz.
    And Sayfa kapatilir.

  Scenario: TC03 Giris yapmak icin gecerli bir kullanici adi, gecersiz sifre ile giris  yapilamamalidir.
    And Acılan ktucukta Username bolumune gecerli bir username girer.
    And Sifre kısmına gecersiz bir sifre girer
    And Sign in butonuna tıklar
    And sayfa 1 saniye bekletilir.
    Then Failed to sign in! Please check your credentials and try again. yazisinin gorur ve giris yapamaz.
    And Sayfa kapatilir.

  Scenario: TC04 Kullanicinin mevcut kimlik bilgilerini her zaman kullanabilecegi, "Remember me" secenegi olmalidir.
    Then Acılan kutucukta Remember me secenegi oldugu dogrulanir.
    And sayfa 1 saniye bekletilir.
    And Sayfa kapatilir.


  Scenario: TC05 Eger sifre unutulursa diye "Did you forget your password?" secenegi olmalidir.
    Then Acılan kutucukta Did you forget your password? secenegi oldugu dogrulanir.
    And sayfa 1 saniye bekletilir.
    And Sayfa kapatilir.

  Scenario: TC06 You don't have an account yet? Register a new account secenegi olmalidir.
    Then Acilan kutucukta You don't have an account yet? Register a new account secenegi oldugu test edilir.
    And sayfa 1 saniye bekletilir.
    And Sayfa kapatilir.

  Scenario: TC07 Cancel secenegi olmalıdır.
    Then Acılan kutucukta Cancel  secenegi oldugu test edilir
    And sayfa 1 saniye bekletilir.
    And Sayfa kapatilir.
