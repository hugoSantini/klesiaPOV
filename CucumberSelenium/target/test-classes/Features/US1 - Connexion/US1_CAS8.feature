Feature: Un nouvel utilisateur doit pouvoir se créer un nouveau compte s'il n'en possède pas déjà un.

  Scenario: Utilisateur sans compte en ligne
    Given Mon navigateur et ouvert avec cookies
    And Je suis sur la page de connexion du formulaire d'imposition
    When Je clique sur Se Créer un compte sur la mire de connexion
    Then Une page pop-up apparais, avec deux choix : Créer votre compte Klesia et 'S'identifier avec FranceConnect


  Scenario: Créer un compte client Klesia
    Given Mon navigateur et ouvert avec cookies
    And Je suis sur la page de connexion du formulaire d'imposition
    When Je clique sur Se Créer un compte sur la mire de connexion
    And Je clique sur Se Créer un compte sur la page Pop-up
    Then La page du formulaire d'inscription s'ouvre


  Scenario: Créer un compte avec FranceConnect
    Given Mon navigateur et ouvert avec cookies
    And Je suis sur la page de connexion du formulaire d'imposition
    When Je clique sur Se Créer un compte sur la mire de connexion
    And Je clique sur la zone S'identifier avec FranceConnect
    Then L'utilisateur est redirigé sur la mire de connexion du site de FranceConnect

