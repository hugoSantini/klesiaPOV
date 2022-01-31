package StepsDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US1_CAS8 extends DriverSuperClass{

    @When("Je clique sur Se Créer un compte sur la mire de connexion")
    public void je_clique_sur_se_créer_un_compte_sur_la_mire_de_connexion() {
        System.out.print("Etape - Je clique sur Se Créer un compte sur la mire de connexion");
        getDriver().findElement(By.xpath("//span[text()='Se créer un compte']")).click();
    }

    @Then("Une page pop-up apparais, avec deux choix : Créer votre compte Klesia et 'S'identifier avec FranceConnect")
    public void une_page_pop_up_apparais_avec_deux_choix_créer_votre_compte_klesia_et_s_identifier_avec_france_connect() {
        System.out.print("Etape - Je clique sur la zone Se créer un compte de FranceConnect dans la Pop-up");
        getDriver().findElement(By.xpath("//h1[text()='Avec FranceConnect']"));
        getDriver().findElement(By.xpath("//h1[text()='En créant votre compte klesia.fr']"));

    }

    @When("Je clique sur Se Créer un compte sur la page Pop-up")
    public void je_clique_sur_se_créer_un_compte_sur_la_page_pop_up() {
        System.out.print("Etape - Je clique sur Se Créer un compte sur la page Pop-up");
        getDriver().findElement(By.xpath("//div[@class='kl-popin-buttons-wrapper']//button[1]")).click();

    }

    @Then("La page du formulaire d'inscription s'ouvre")
    public void la_page_du_formulaire_d_inscription_s_ouvre() {
        System.out.print("Etape - La page du formulaire d'inscription s'ouvre");
        String currentURL = getDriver().getCurrentUrl();
        Assert.assertEquals("https://re7-particuliers.klesia.fr/account/create/member", currentURL);
    }

    @When("Je clique sur la zone S'identifier avec FranceConnect")
    public void je_clique_sur_la_zone_s_identifier_avec_france_connect() {
        System.out.print("Etape - Je clique sur la zone S'identifier avec FranceConnect");
        getDriver().findElement(By.xpath("//div[@class='kl-login-france']//img[1]")).click();

    }

    @Then("L'utilisateur est redirigé sur la mire de connexion du site de FranceConnect")
    public void l_utilisateur_est_redirigé_sur_la_mire_de_connexion_du_site_de_france_connect() {
        System.out.print("Etape - L'utilisateur est redirigé sur la mire de connexion du site de FranceConnect");
        String currentURL = getDriver().getCurrentUrl();
        currentURL = currentURL.substring(0,47);
        System.out.println(currentURL);
        Assert.assertEquals("https://fcp.integ01.dev-franceconnect.fr/api/v1", currentURL);
    }

}
