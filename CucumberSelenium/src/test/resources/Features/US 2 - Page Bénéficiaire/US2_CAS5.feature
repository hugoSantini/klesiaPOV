Feature: La liste des items présent dans "Type de Rente" pour un client Carcept-prev doit être la suivante : "Invalidité", "Inaptitude à conduite", "Congés de fin d'activité (CFA)", "Rente éducation", "Rente Conjoint".

  Scenario: Les différentes items de la liste de "Type de rente" Carcept-Prev :

    Given Mon navigateur et ouvert avec cookies
    And Je me connecte a un compte avec les identifiants : "duboisjerome76@yopmail.com" et "Azerty123456?" Carcept
    When J'arrive sur la page première page du formulaire
    When Je clique sur Type de Rente
    Then Je peux choisir : "Invalidité"
    And Je peux choisir : "Rente éducation"
    And Je peux choisir : "Rente conjoint"
    And Je peux choisir : "Inaptitude à conduite"