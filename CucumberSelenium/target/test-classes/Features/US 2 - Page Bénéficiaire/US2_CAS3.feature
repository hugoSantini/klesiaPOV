Feature: Le champ suivant doit être présent (avec son type) dans le bloc "Informations sur votre rente" : "Type de rente" -> Liste déroulante

  Scenario: Bonne présence des champs du bloc "Informations sur votre rente" :

    Given Mon navigateur et ouvert avec cookies
    And Je me connecte a un compte avec les identifiants : "merot.cynthia@yopmail.com" et "Azerty123456?"
    When J'arrive sur la page première page du formulaire
    Then Le champ "Type de rente" est présent et est de type "Liste déroulante"