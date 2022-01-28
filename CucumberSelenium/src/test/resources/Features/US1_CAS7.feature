Feature:  Si l'utilisateur s'est déjà connecté il y a peu, il accède directement à son espace client lorsqu'il rejoins la mire de connexion.

  Scenario: Utilisateur déjà connecté
    Given Je suis déjà connecté,
    When J'accède a la mire de connexion,
    Then Je suis directement redirigé vers la page "Bénéficiaire" du formulaire d'imposition.

