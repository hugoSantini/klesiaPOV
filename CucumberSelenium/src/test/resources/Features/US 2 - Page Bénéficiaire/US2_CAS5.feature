Feature: La liste des items présent dans "Type de Rente" pour un client Carcept-prev doit être la suivante : "Invalidité", "Inaptitude à conduite", "Congés de fin d'activité (CFA)", "Rente éducation", "Rente Conjoint".

  Scenario: Les différentes items de la liste de "Type de rente" Carcept-Prev :

    Given Je suis sur la page bénéficiaires avec des identifiant Carcept-Prev,
    When Je clique pour dérouler la liste des type de rente,
    Then Les élément suivant s'affiche : "Invalidité", "Inaptitude à conduite", "Congés de fin d'activité (CFA)", "Rente éducation", "Rente Conjoint".

