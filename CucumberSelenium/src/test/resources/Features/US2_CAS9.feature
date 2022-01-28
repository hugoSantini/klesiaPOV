Feature: Si le client n'habite pas a l'étranger alors le document demandé sera : "Avis d'imposition".

  Scenario: Non à la résidence a l'étranger.

    Given Je suis sur la page bénéficiaires,
    When Je remplis tout les champs
    And Je modifie le champ "Résidence à l'étranger" pour y répondre "Non" si ce n'est pas déjà fait,
    Then Dans la box "Pièce obligatoire" doit figuré et uniquement figuré la pièce : "Avis d'imposition".
