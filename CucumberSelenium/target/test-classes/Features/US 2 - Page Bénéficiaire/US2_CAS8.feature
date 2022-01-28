Feature: Si le client habite a l'étranger alors le document demandé sera : "Attestation de résidence à l'étranger".

  Scenario: Oui à la résidence a l'étranger :

    Given Je suis sur la page bénéficiaires,
    When Je remplis tout les champs
    And Je modifie le champ "Résidence à l'étranger" pour y répondre "Oui" si ce n'est pas déjà fait,
    Then Dans la box "Pièce obligatoire" doit figuré et uniquement figuré la pièce : "Attestation de résidence à l'étranger"
