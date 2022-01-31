Feature: Une tentative de connexion avec des identifiants incorrects doit conclure à une erreur ainsi qu'a l'affichage de cette dernière.

  Scenario Outline: Connexion vers l'espace client avec mauvais MDP ou identifiant

    Given Mon navigateur et ouvert avec cookies
    And Je suis sur la page de connexion du formulaire d'imposition
    When Je rentre mon identifiant : "<Identifiant>"
    And Je rentre mon mdp : "<MDPinco>"
    And J'appuye sur 'Se connecter'
    Then Un message d'erreur s'affiche

    Examples:
      | Identifiant                | MDPinco  |
      | agatharongatry@yopmail.com | mdp1inco |
      | id2                        | mdp2inco |