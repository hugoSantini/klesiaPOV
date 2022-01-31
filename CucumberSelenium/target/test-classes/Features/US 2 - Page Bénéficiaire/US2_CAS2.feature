Feature: Les champs suivant doivent être présent (avec leurs types): "Information du bénéficiaire" : "Civilité" -> Bouton Radio, "Nom de Naissance" -> Champ de saisie, "Prénom" -> Champ de saisie, "Numéro de sécurité sociale" -> Champ de saisie, "Date de naissance" -> Calendrier, "Numéro de téléphone" -> Champ de saisie, "Adresse mail" -> Champ de saisie, "Adresse" -> Champ de saisie, "Résidence a l'étranger" -> Bouton Radio.

  Scenario: Bonne présence des champs du bloc "Informations du bénéficiaire"

    Given Mon navigateur et ouvert avec cookies
    And Je me connecte a un compte avec les identifiants : "merot.cynthia@yopmail.com" et "Azerty123456?"
    When J'arrive sur la page première page du formulaire
    Then Le champ "Civilité" est présent et est de type "Bouton Radio"
    And Le champ "Nom de Naissance" est présent et est de type "Champ de saisie"
    And Le champ "Prénom" est présent et est de type "Champ de saisie"
    And Le champ "Numéro de sécurité sociale" est présent et est de type "Champ de saisie"
    And Le champ "Date de naissance" est présent et est de type "Calendrier"
    And Le champ "Numéro de téléphone" est présent et est de type "Champ de saisie"
    And Le champ "Adresse mail" est présent et est de type "Champ de saisie"
    And Le champ "Adresse" est présent et est de type "Champ de saisie"
    And Le champ "Résidence a l'étranger" est présent et est de type "Bouton Radio"
