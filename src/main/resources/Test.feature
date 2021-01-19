Feature: Hepsiburada


  Scenario: Hepsiburada Urun Senaryoları
    Given Chrome baslatilir.
    When Hepsiburada.com giris yapilir.
    And Iphone urunleri aranır.
    And Iphone urunlerinin basariyla geldigi gorulur.
    And Iphone 11 urunu tiklanir.
    And Iphone 11 urunu basariyla geldigi gorulur.
    And Iphone 11 urunu degerlendirmeler butonuna tiklanir.
    And İphone 11 urunu ilk degerlendirme evet butonuna tiklanir.
    And Ilk yorum basariyla tiklandigi ve Tesekkur Ederiz yazisinin basariyla geldigi gorulur.
    Then Testin tamamlandigi gorulur.