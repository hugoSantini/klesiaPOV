Fonctionnalité : Les champs suivant doivent impérativement être renseigné pour pouvoir avancer à la page suivante : "Civillité", "Nom de naissance", "Prenom", "NIR", "Date de naissance", "Telephone", "Adresse", "Résidence Fiscale A l'étranger", "Type de rente".

  Scenario: Un des champs obligatoire est vide

    Given Je suis sur la page bénéficiaires,
    When Je remplis tout les champs des deux blocs de la page,
    And Je supprime le champ <champ>,
    And Je confirme la saisie de ses champs en cliquant sur "Suivant",
    Then La page ne change pas et le champ <champ> se rougit.

      |champ|
      |civilite|
      |nomDeNaissance|
      |prenom|
      |NIR|
      |dateDeNaissance|
      |telephone|
      |adresse|
      |residenceFiscaleALetranger|
      |typeDeRente|

  Scenario: Un des champs obligatoire est remplis d'une mauvaise manière

    Given Je suis sur la page bénéficiaires,
    When Je remplis tout les champs des deux blocs de la page,
    And Je supprime le champ <champ>,
    And Je confirme la saisie de ses champs en cliquant sur "Suivant",
    Then La page ne change pas et le champ <champ> se rougit.