Feature: Connexion réussite à l’espace client avec des logins client Klesia

  Scenario: Connexion réussite à l’espace client avec des logins client Klesia

    Given je possède un compte client en ligne Klesia,
    When Je rentre mon <identifiant> dans la zone "Identifiant",
    And Je rentre mon <MDP> dans la zone "Mot de passe",
    Then Ma page d'accueil client s'ouvre correctement.

      |  identifiant | MDP |

      |     id1      |mdp1 |
      |     id2      |mdp2 |

