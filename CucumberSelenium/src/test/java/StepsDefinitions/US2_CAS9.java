package StepsDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class US2_CAS9 extends DriverSuperClass {

    @Then("Dans la box Pièce obligatoire doit figuré et uniquement figuré la pièce : Avis d'imposition")
    public void dansLaBoxPièceObligatoireDoitFiguréEtUniquementFiguréLaPièceAvisDImposition() {
        System.out.println("Dans la box Pièce obligatoire doit figuré et uniquement figuré la pièce : Avis d'impositionr");
        getDriver().findElement(By.xpath("//h3[text()='Avis d'imposition ']"));
    }

}
