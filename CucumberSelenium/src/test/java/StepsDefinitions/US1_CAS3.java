package StepsDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US1_CAS3 extends DriverSuperClass {

    @When("Je clique sur la zone S'authentifier via FranceConnect")
    public void je_clique_sur_la_zone_s_authentifier_via_france_connect(){
        System.out.println("Etape - Je clique sur le bouton FranceConnect");
        System.out.print(getDriver().findElement(By.xpath("//body")).getAttribute("innerHTML"));
        getDriver().findElement(By.xpath("//div[@class='kl-login-ent']//a")).click();
    }

    @Then("La page d’identification FranceConnect s'ouvre correctement")
    public void la_page_d_identification_france_connect_s_ouvre_correctement() {
        System.out.println("Etape - Rentrer l'ID");
        String currentURL = getDriver().getCurrentUrl();
        currentURL = currentURL.substring(0,47);
        System.out.println(currentURL);
        Assert.assertEquals("https://fcp.integ01.dev-franceconnect.fr/api/v1", currentURL);

    }

}
