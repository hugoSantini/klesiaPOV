Feature:  Si l'utilisateur a oublier son mot de passe, il doit pouvoir lancé la procédure de récupération

  Scenario: Lancement de la procédure mot de passe oublié
    Given je possède un compte dont je ne suis plus sûr du MDP,
    When Je clique sur "Mot de passe oublié",
    Then La procédure de mot de passe oublié démarre.

