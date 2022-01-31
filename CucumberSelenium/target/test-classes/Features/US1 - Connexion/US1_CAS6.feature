Feature: Si l'utilisateur a oublier son identifiant, il doit pouvoir lancé la procédure de récupération.

  Scenario: Lancement de la procédure d'identifiant oublié
    Given Mon navigateur et ouvert avec cookies
    And Je suis sur la page de connexion du formulaire d'imposition
    When Je clique sur Identifiant oublié,
    Then La procédure d'identifiant oublié démarre.

