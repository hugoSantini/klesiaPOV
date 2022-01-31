package StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class US1_CAS4 extends DriverSuperClass {


    @Given("Je suis sur la mire de connexion FranceConnect")
    public void je_suis_sur_la_mire_de_connexion_france_connect() {
        System.out.println("Etape - J'entre sur la mire de connexion FranceConnect");
        getDriver().findElement(By.xpath("//div[@class='kl-login-ent']/a")).click();
    }

    @When("Je clique sur l' {string} qui m'est dédier")
    public void je_clique_sur_l_qui_m_est_dédier(String string) {
        System.out.println("Etape - Je clique sur mon espace dédier");
        System.out.println("Espace dédier : " + string);
    }

    @When("Je clique sur Entrée,")
    public void je_clique_sur_entrée() {
        System.out.println("Etape - Je clique sur Entrée");
        getDriver().findElement(By.id("azerty")).click();
    }

}
