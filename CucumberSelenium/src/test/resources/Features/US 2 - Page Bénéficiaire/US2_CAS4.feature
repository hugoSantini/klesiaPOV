Feature: La liste des items présent dans "Type de Rente" pour un client Klesia doit être la suivante : "Invalidité", "Rente éducation", "Rente conjoint".

  Scenario: Les différentes items de la liste de "Type de rente" Klesia

    Given Je suis sur la page bénéficiaires avec des identifiant Klesia,
    When Je clique pour dérouler la liste des type de rente,
    Then Les éléments suivant s'affiche : "Invalidité", "Rente éducation", "Rente conjoint".
