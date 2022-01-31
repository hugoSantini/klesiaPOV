Feature: Deux blocs doivent être présent sur la page : "Information du bénéficiaire", "Information sur votre rente".

  Scenario:
    Given Mon navigateur et ouvert avec cookies
    When Je me connecte a un compte avec les identifiants : "merot.cynthia@yopmail.com" et "Azerty123456?"
    Then J'arrive sur la page première page du formulaire

  Scenario: Civilité est vide (Champs ecrits)

    Given J'arrive sur la page première page du formulaire
    And Je rafraichi la page
    When J'arrive sur la page première page du formulaire
    And Je complète le champ "Résidence à l'étranger" en choisissant "Non"
    And Je complète le champ "Nom de naissance" avec "Merot"
    And Je complète le champ "Prénom" avec "Cynthia"
    And Je complète le champ "NIR" avec "1790338185095"
    And Je complète le champ "Date de naissance" avec "14021997"
    And Je complète le champ "Numéro de téléphone" avec "0612345678"
    And Je complète le champ "Adresse" avec "97 Rue Adrien Lemoine, 95300 Pontoise, France"
    And Je complète le champ "Adresse email" avec "merot.cynthia@yopmail.com"
    And Je choisi mon type de rente: "Invalidité"
    And Je confirme la saisie de ses champs en cliquant sur Suivant
    Then Ce champ est obligatoire apparait

  Scenario: Résidence a l'étranger est vide (Champs ecrits)

    Given Mon navigateur et ouvert avec cookies
    And Je me connecte a un compte avec les identifiants : "merot.cynthia@yopmail.com" et "Azerty123456?"
    When J'arrive sur la page première page du formulaire
    And Je complète le champ "Civilité" en choisissant "Madame"
    And Je complète le champ "Nom de naissance" avec "Merot"
    And Je complète le champ "Prénom" avec "Cynthia"
    And Je complète le champ "NIR" avec "1790338185095"
    And Je complète le champ "Date de naissance" avec "14021997"
    And Je complète le champ "Numéro de téléphone" avec "0612345678"
    And Je complète le champ "Adresse" avec "97 Rue Adrien Lemoine, 95300 Pontoise, France"
    And Je complète le champ "Adresse email" avec "merot.cynthia@yopmail.com"
    And Je choisi mon type de rente: "Invalidité"
    And Je confirme la saisie de ses champs en cliquant sur Suivant
    Then Ce champ est obligatoire apparait

  Scenario Outline:
    Given J'arrive sur la page première page du formulaire
    And Je rafraichi la page
    When Je complète le champ "Civilité" en choisissant "Madame"
    And Je complète le champ "Résidence à l'étranger" en choisissant "Non"
    And Je complète le champ "Nom de naissance" avec "Merot"
    And Je complète le champ "Prénom" avec "Cynthia"
    And Je complète le champ "NIR" avec "1790338185095"
    And Je complète le champ "Date de naissance" avec "14021997"
    And Je complète le champ "Numéro de téléphone" avec "0612345678"
    And Je complète le champ "Adresse" avec "97 Rue Adrien Lemoine, 95300 Pontoise, France"
    And Je complète le champ "Adresse email" avec "merot.cynthia@yopmail.com"
    And Je choisi mon type de rente: "Invalidité"
    And Je supprime le champ "<champ>"
    And Je confirme la saisie de ses champs en cliquant sur Suivant
    Then Ce champ est obligatoire apparait

    Examples:
      |champ|
      |Nom de naissance|
      |Prénom|
      |NIR|
      |Date de naissance|
      |Numéro de téléphone|
      |Adresse|
      |Adresse email|
