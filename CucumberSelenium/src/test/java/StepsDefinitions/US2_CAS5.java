package StepsDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;


public class US2_CAS5 extends DriverSuperClass{

    @And("Je me connecte a un compte avec les identifiants : {string} et {string} Carcept")
    public void jeMeConnecteAUnCompteAvecLesIdentifiantsEtCarcept(String string, String string2) {
        System.out.println("Connexion avec les id : " + string + " et " + string2 + ".");
        getDriver().navigate().to("https://re7-contact.klesia.fr/carcept/form");
        getDriver().findElement(By.id("username")).sendKeys(string);
        getDriver().findElement(By.id("password")).sendKeys(string2);
        getDriver().findElement(By.name("login")).click();
    }

}
