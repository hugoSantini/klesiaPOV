package StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class US2_CAS1 extends DriverSuperClass {

    @Given("Je me connecte a un compte avec les identifiants : {string} et {string}")
    public void je_me_connecte_a_un_compte_avec_les_identifiants_et(String string, String string2) {
        System.out.println("Connexion avec les id : " + string + " et " + string2 + ".");
        getDriver().navigate().to("https://re7-contact.klesia.fr/form");
        getDriver().findElement(By.id("username")).sendKeys(string);
        getDriver().findElement(By.id("password")).sendKeys(string2);
        getDriver().findElement(By.name("login")).click();
    }

    @Then("Deux blocs sont présent : Information du bénéficiaire, Information sur votre rente")
    public void deux_blocs_sont_présent_information_du_bénéficiaire_information_sur_votre_rente() {
        System.out.println("Les deux blocs sont bien présent.");
        getDriver().findElement(By.xpath("//h2[contains(text(),'Informations du bénéficiaire')]"));
        getDriver().findElement(By.xpath("//h2[contains(text(),'Informations sur votre rente')]"));
    }


}
