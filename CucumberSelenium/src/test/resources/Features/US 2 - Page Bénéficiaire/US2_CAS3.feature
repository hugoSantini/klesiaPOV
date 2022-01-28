Feature: Le champ suivant doit être présent (avec son type) dans le bloc "Informations sur votre rente" : "Type de rente" -> Liste déroulante

  Scenario: Bonne présence des champs du bloc "Informations sur votre rente" :

    Given Je viens de me connecté,
    When Je suis sur la page "Bénéficiaire",
    Then les champs suivants sont présent dans le bloc "Information du bénéficiaire" : "Type de rente" -> Liste déroulante
