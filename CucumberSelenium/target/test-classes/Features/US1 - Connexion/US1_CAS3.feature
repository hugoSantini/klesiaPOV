Feature: Il doit y avoir un bouton permettant d'accéder a la mire de connexion "FranceConnect"

  Scenario: Accès a l'espace de connexion FranceConnect
    Given Mon navigateur et ouvert avec cookies
    And Je suis sur la page de connexion du formulaire d'imposition
    When Je clique sur la zone S'authentifier via FranceConnect
    Then La page d’identification FranceConnect s'ouvre correctement

