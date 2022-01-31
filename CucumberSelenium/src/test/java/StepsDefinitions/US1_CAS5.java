package StepsDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US1_CAS5 extends DriverSuperClass{

    @When("Je clique sur Mot de passe oublié,")
    public void jeCliqueSurMotDePasseOublié() {
        System.out.println("Etape - Check message d'erreur");
        getDriver().findElement(By.xpath("//span[@class='login-pf-settings']//a[1]")).click();
    }

    @Then("La procédure de mot de passe oublié démarre.")
    public void la_procédure_de_mot_de_passe_oublié_démarre() {
        System.out.println("Etape - Check message d'erreur");
        getDriver().findElement(By.xpath("//div[@class='kl-net-ent-form']")).click();
    }

}
