Feature: Si l'utilisateur a oublier son identifiant, il doit pouvoir lancé la procédure de récupération.

  Scenario: Lancement de la procédure d'identifiant oublié
    Given Je possède un compte dont je ne connais plus mon identifiant,
    When Je clique sur "Identifiant oublié",
    Then La procédure d'identifiant oublié démarre.

