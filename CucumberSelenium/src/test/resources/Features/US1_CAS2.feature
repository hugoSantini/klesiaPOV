Feature: Une tentative de connexion avec des identifiants incorrects doit conclure à une erreur ainsi qu'a l'affichage de cette dernière.

  Scenario: Connexion vers l'espace client avec mauvais MDP ou identifiant

    Given je possède un compte dont je ne suis plus sur du MDP,
    When Je rentre mon <identifiant> dans la zone "Identifiant",
    And que Je rentre mon <MDPinco> dans la zone "Mot de passe",
    And que Je clique sur "Entrée",
    Then Un message d'erreur s'affiche.


      |identifiant   | MDPinco |
      |     id1      |mdp1inco |
      |     id2      |mdp2inco |