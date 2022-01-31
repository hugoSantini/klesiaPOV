package StepsDefinitions;

import io.cucumber.java.en.When;

public class US1_CAS7 extends DriverSuperClass{

    @When("J'accede a la mire de connexion")
    public void j_accede_a_la_mire_de_connexion() {
        System.out.println("Etape - J'accède a la mire de connexion");
        getDriver().navigate().to("https://re7-contact.klesia.fr/form");
    }

}
