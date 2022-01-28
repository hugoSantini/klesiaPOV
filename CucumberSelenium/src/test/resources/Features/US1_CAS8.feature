Feature: Un nouvel utilisateur doit pouvoir se créer un nouveau compte s'il n'en possède pas déjà un.

  Scenario: Utilisateur sans compte en ligne
    Given Je ne possède pas de compte client en ligne,
    When Je clique sur la zone "Se créer un compte",
    Then Une page "Pop-up" apparais, avec deux choix : "Créer votre compte Klesia" et "S'identifier avec FranceConnect.


  Scenario: Créer un compte client Klesia
    Given Je ne possède pas de compte client en ligne et que donc j'ai déjà cliqué sur "Se créer un compte"
    When Je rentre mon <identifiant> dans la zone "Identifiant",
    Then La page du formulaire d'inscription s'ouvre.


  Scenario: Créer un compte avec FranceConnect
    Given Je ne possède pas de compte client en ligne et que donc j'ai déjà cliqué sur "Se créer un compte",
    When Je clique sur la zone "S'identifier avec FranceConnect",
    Then L'utilisateur est redirigé sur la mire de connexion du site de FranceConnect.

