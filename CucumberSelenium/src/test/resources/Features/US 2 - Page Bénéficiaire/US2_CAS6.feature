Feature: Les champs suivant ont un type et un format associé : "Civilité" -> Bouton Radio, "Nom de Naissance" -> Champ de saisie, "Prénom" -> Champ de saisie, "Numéro de sécurité sociale" -> Champ de saisie, "Date de naissance" -> Calendrier, "Numéro de téléphone" -> Champ de saisie, "Adresse mail" -> Champ de saisie, "Résidence a l'étranger" -> Bouton Radio.

  Scenario: L'intégralité des champs sont renseigné correctement :

    Given Je suis sur la page bénéficiaires,
    When Je complète le champ "Civilité" en choisissant une des deux options possibles,
    And Je complète le champ "Nom de naissance" avec des caractères alphabétique,
    And Je complète le champ "Nom d'usage" avec des caractères alphabétique,
    And Je complète le champ "Prénom" avec des caractères alphabétique,
    And Je complète le champ "NIR" avec des caractères alphanumérique,
    And Je complète le champ "Date de naissance" avec des caractère numérique,
    And Je complète le champ "Numéro de téléphone" avec des caractère numérique,
    And Je complète le champ "Adresse email" avec la forme : Alphanumérique + "@" + alphanumérique + "." + alphabétique,
    And Je complète le champ "Résidence à l'étranger" en choisissant une des deux options possible,
    And Je confirme la saisie de ses champs en cliquant sur "Suivant",
    Then  la page suivante s'affiche (page "Informations Fiscales").