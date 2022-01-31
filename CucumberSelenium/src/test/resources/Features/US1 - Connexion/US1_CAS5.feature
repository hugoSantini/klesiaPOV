Feature:  Si l'utilisateur a oublier son mot de passe, il doit pouvoir lancé la procédure de récupération

  Scenario: Lancement de la procédure mot de passe oublié
    Given Mon navigateur et ouvert avec cookies
    And Je suis sur la page de connexion du formulaire d'imposition
    When Je clique sur Mot de passe oublié,
    Then La procédure de mot de passe oublié démarre.

