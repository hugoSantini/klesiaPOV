Feature: L'utilisateur doit pouvoir se connecté a sont compte directement relier a un compte "FranceConnect".

  Scenario: Connexion via un compte FranceConnect

    Given je suis sur la mire de connexion FranceConnect,
    When Je clique sur l'espace qui m'est dédier,
    And Je rentre mon <identifiant> dans la zone "Identifiant",
    And Je rentre mon <MDP> dans la zone "Mot de passe",
    And Je clique sur "Entrée",
    Then Le formulaire s'ouvre correctement (avec le bon <compteClient>).


      |identifiant   | MDP |   compteClient |

      |     id1      |mdp1 |     compte1    |
      |     id2      |mdp2 |     compte2    |