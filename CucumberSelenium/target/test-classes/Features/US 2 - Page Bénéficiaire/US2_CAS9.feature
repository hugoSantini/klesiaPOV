Feature: Si le client n'habite pas a l'étranger alors le document demandé sera : "Avis d'imposition".

  Scenario: Non à la résidence a l'étranger.

    Given Mon navigateur et ouvert avec cookies
    And Je me connecte a un compte avec les identifiants : "merot.cynthia@yopmail.com" et "Azerty123456?"
    When J'arrive sur la page première page du formulaire
    And Je complète le champ "Civilité" en choisissant "Madame"
    And Je complète le champ "Résidence à l'étranger" en choisissant "Non"
    And Je complète le champ "Nom de naissance" avec "Merot"
    And Je complète le champ "Prénom" avec "Cynthia"
    And Je complète le champ "NIR" avec "1790338185095"
    And Je complète le champ "Date de naissance" avec "14021997"
    And Je complète le champ "Numéro de téléphone" avec "0612345678"
    And Je complète le champ "Adresse" avec "97 Rue Adrien Lemoine, 95300 Pontoise, France"
    And Je complète le champ "Adresse email" avec "merot.cynthia@yopmail.com"
    And Je choisi mon type de rente: "Invalidité"
    Then Dans la box Pièce obligatoire doit figuré et uniquement figuré la pièce : Avis d'imposition
