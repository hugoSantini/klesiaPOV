Feature: La liste des items présent dans "Type de Rente" pour un client Klesia doit être la suivante : "Invalidité", "Rente éducation", "Rente conjoint".

  Scenario: Les différentes items de la liste de "Type de rente" Klesia

    Given Mon navigateur et ouvert avec cookies
    And Je me connecte a un compte avec les identifiants : "merot.cynthia@yopmail.com" et "Azerty123456?"
    When J'arrive sur la page première page du formulaire
    And Je clique sur Type de Rente
    Then Je peux choisir : "Invalidité"
    And Je peux choisir : "Rente éducation"
    And Je peux choisir : "Rente conjoint"
