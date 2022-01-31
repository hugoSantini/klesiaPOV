package StepsDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class US1_CAS6 extends DriverSuperClass{

    @When("Je clique sur Identifiant oublié,")
    public void jeCliqueSurIdentifiantOublié() {
        System.out.println("Etape - Clique sur ID oublié");
        getDriver().findElement(By.xpath("//div[@class='form-group login-pf-settings']//a[1]")).click();
    }

    @Then("La procédure d'identifiant oublié démarre.")
    public void la_procédure_d_identifiant_oublié_démarre() {
        System.out.println("Etape - La procédure d'identifiant oublié démarre");
        getDriver().findElement(By.xpath("//div[@class='kl-forgot-user-form']"));
    }

}
