Feature:  Si l'utilisateur s'est déjà connecté il y a peu, il accède directement à son espace client lorsqu'il rejoins la mire de connexion.

  Scenario: Utilisateur déjà connecté
    Given Mon navigateur et ouvert avec cookies
    And Je suis sur la page de connexion du formulaire d'imposition
    And Je rentre mon identifiant : "merot.cynthia@yopmail.com"
    And Je rentre mon mdp : "Azerty123456?"
    And J'appuye sur 'Se connecter'
    When J'accede a la mire de connexion
    Then J'arrive sur la page première page du formulaire

