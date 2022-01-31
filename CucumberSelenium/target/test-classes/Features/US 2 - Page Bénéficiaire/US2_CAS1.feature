Feature: Deux blocs doivent être présent sur la page : "Information du bénéficiaire", "Information sur votre rente".

  Scenario: Présence des blocs

    Given Mon navigateur et ouvert avec cookies
    And Je me connecte a un compte avec les identifiants : "merot.cynthia@yopmail.com" et "Azerty123456?"
    When J'arrive sur la page première page du formulaire
    Then Deux blocs sont présent : Information du bénéficiaire, Information sur votre rente

