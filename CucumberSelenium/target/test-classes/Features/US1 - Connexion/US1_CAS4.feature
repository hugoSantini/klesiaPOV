#Pas testable ATM (Pas de log franceconnect)

Feature: L'utilisateur doit pouvoir se connecté a sont compte directement relier a un compte "FranceConnect".

  Scenario Outline: Connexion via un compte FranceConnect

    Given Mon navigateur et ouvert avec cookies
    And Je suis sur la mire de connexion FranceConnect
    When Je clique sur l' "<espace>" qui m'est dédier
    And Je rentre mon identifiant : "<Identifiant>"
    And Je rentre mon mdp : "<MDP>"
    And Je clique sur Entrée,
    Then J'arrive sur la page première page du formulaire

    Examples:
      | Identifiant | MDP  | espace  |
      | id1         | mdp1 | espace1 |
      | id2         | mdp2 | espace2 |