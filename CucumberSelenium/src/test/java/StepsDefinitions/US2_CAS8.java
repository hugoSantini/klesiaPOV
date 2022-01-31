package StepsDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class US2_CAS8 extends DriverSuperClass {

    @Then("Dans la box Pièce obligatoire doit figuré et uniquement figuré la pièce : Attestation de résidence à l'étranger")
    public void dansLaBoxPièceObligatoireDoitFiguréEtUniquementFiguréLaPièceAttestationDeRésidenceÀLÉtranger() {
        System.out.println("Etape - Dans la box Pièce obligatoire doit figuré et uniquement figuré la pièce : Attestation de résidence à l'étranger");
        getDriver().findElement(By.xpath("//h3[text()='Attestation de résidence à l’étranger ']"));
    }


}
