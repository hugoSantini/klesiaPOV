Feature: Il doit y avoir un bouton permettant d'accéder a la mire de connexion "FranceConnect"

  Scenario: Accès a l'espace de connexion FranceConnect
    Given je possède un compte client en ligne Klesia associer à un compte FranceConnect,
    When Je clique sur la zone dédier "S'authentifier via FranceConnect",
    Then La page d’identification FranceConnect s'ouvre correctement.

