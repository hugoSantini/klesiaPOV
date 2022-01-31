package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class US2_CAS4 extends DriverSuperClass{

    @When("Je peux choisir mon Type de Rente")
    public void je_peux_choisir_mon_type_de_rente() {
        System.out.println("Je peux choisir mon Type de Rente");
        getDriver().findElement(By.xpath("/html/body/app-root/app-form/div[2]/div/app-step1/form/section[2]/app-input-select/div/div/select"));
    }

    @Then("Je peux choisir : {string}")
    public void je_peux_choisir(String string) {
        System.out.println("Etape - Je peux choisir : val");
        getDriver().findElement(By.xpath("//option[text()='"+ string +"']"));
    }

    @And("Je clique sur Type de Rente")
    public void jeCliqueSurTypeDeRente() {
        System.out.println("Je clique sur Type de Rente");
        getDriver().findElement(By.xpath("/html/body/app-root/app-form/div[2]/div/app-step1/form/section[2]/app-input-select/div/div/select")).click();
    }

}
