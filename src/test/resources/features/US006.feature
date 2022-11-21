@US06
Feature: US06Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.

  Background: ortak adimlar
    Given Kullanici belirtilen medunnaUrl'e gider.
    And sayfa 3 saniye bekletilir.
    When Kullanici sayfada sag uste bulunan kisi iconuna tiklar ve sign in ve register sekmesi acilir.
    And Kullanici sign in sekmesine basar.
    And sayfa 3 saniye bekletilir.

    And gecerli usurname ve password ile giriş yapar
    And sayfa 1 saniye bekletilir.
    And sag ustte yer alan sigin in  butonuna ve settings e tiklar

  @tc1
  Scenario: TC01 Kullanıcı bilgileri "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır.
    Given acilan sayfanin First name kisminda giriş yapılan First name'in yazdığı doğrulanır
    Then açılan sayfanın Last Name kısmında giriş yapılan Last name'in yazdığı doğrulanır
    Then açılan sayfanın Email kısmında giriş yapılan Email'in yazdığı doğrulanır
    And sayfa 2 saniye bekletilir.
    And  Sayfa kapatilir.

  @tc2
  Scenario: TC02 "Firstname"güncelleme seçeneği olmalıdır.
    And açılan sayfayanın First Name kısmına Yeni bir First Name yazılır ve Save ikonuna tıklanır
    Then Settings saved! yazisinin gorulduğu dogrulanir
   ##Then  sağ üstte yer alan First  name yazısının guncellendigi dogrulanır
    And sayfa 2 saniye bekletilir.
    And  Sayfa kapatilir.

  Scenario: TC03 "Lastname" güncelleme seçeneği olmalıdır.
    And açılan sayfayanın Last Name kısmına Yeni bir Last Name yazılır ve Save ikonuna tıklanır
    Then Settings saved! yazisinin gorulduğu dogrulanir
    ##Then sağ üstte yer alan  Last name yazisinin guncellendigi dogrulanir
    And sayfa 2 saniye bekletilir.
    And  Sayfa kapatilir.

  Scenario: TC04  "E-mail" güncelleme seçeneği olmalıdır.
    And açilan sayfayanin Email kismina Yeni bir Email yazilir ve Save ikonuna tiklanir
    Then Settings saved! yazisinin gorulduğu dogrulanir
    And sayfa 2 saniye bekletilir.
    And  Sayfa kapatilir.