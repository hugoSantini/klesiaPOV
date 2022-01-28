Feature: Les champs suivant doivent être présent (avec leurs types): "Information du bénéficiaire" : "Civilité" -> Bouton Radio, "Nom de Naissance" -> Champ de saisie, "Prénom" -> Champ de saisie, "Numéro de sécurité sociale" -> Champ de saisie, "Date de naissance" -> Calendrier, "Numéro de téléphone" -> Champ de saisie, "Adresse mail" -> Champ de saisie, "Adresse" -> Champ de saisie, "Résidence a l'étranger" -> Bouton Radio.

  Scenario: Bonne présence des champs du bloc "Informations du bénéficiaire"

    Given Je viens de me connecté,
    When Je suis sur la page "Bénéficiaire",
    Then Les champs suivants sont présent dans le bloc "Information du bénéficiaire" : "Civilité" -> Bouton Radio, "Nom de Naissance" -> Champ de saisie, "Prénom" -> Champ de saisie, "Numéro de sécurité sociale" -> Champ de saisie, "Date de naissance" -> Calendrier, "Numéro de téléphone" -> Champ de saisie, "Adresse mail" -> Champ de saisie, "Adresse" -> Champ de saisie, "Résidence a l'étranger" -> Bouton Radio.
