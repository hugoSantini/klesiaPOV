Feature: Deux blocs doivent être présent sur la page : "Information du bénéficiaire", "Information sur votre rente".

  Scenario: Présence des blocs

    Given Je viens de me connecté,
    When Je suis sur la page "Bénéficiaire",
    Then Deux blocs sont présent : "Information du bénéficiaire", "Information sur votre rente".
