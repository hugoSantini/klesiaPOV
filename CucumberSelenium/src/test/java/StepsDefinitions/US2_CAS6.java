package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;


public class  US2_CAS6 extends DriverSuperClass{

    @When("Je complète le champ {string} en choisissant {string}")
    public void jeComplèteLeChampEnChoisissant(String champ, String input) {
        System.out.println("Je complète le champ en choisissant champ = " +champ + " input = " +  input);
        switch (champ) {
            case "Civilité" :
                switch (input){
                    case "Madame" :
                        getDriver().findElement(By.xpath(("(//input[@type='radio'])[1]"))).click();
                        break;
                    case "Monsieur" :
                        getDriver().findElement(By.xpath(("(//input[@type='radio'])[2]"))).click();
                        break;
                }
            case "Résidence à l'étranger" :
                switch (input){
                    case "Oui" :
                        getDriver().findElement(By.xpath(("(//input[@type='radio'])[3]"))).click();
                        break;
                    case "Non" :
                        getDriver().findElement(By.xpath(("(//input[@type='radio'])[4]"))).click();
                        break;
                }
        }
    }

    @When("Je complète le champ {string} avec {string}")
    public void jeComplèteLeChampAvec(String champ, String input) {
        System.out.println("Etape - Je complète le champ avec input");
        switch (champ){
            case "Nom de naissance" :
                getDriver().findElement(By.xpath("(//label[text()='Nom de naissance']/following::input)[1]")).sendKeys(input);
                break;
            case "Prénom" :
                getDriver().findElement(By.xpath("(//label[text()='Prénom']/following::input)[1]")).sendKeys(input);
                break;
            case "NIR" :
                getDriver().findElement(By.xpath("(//label[text()='Numéro de sécurité sociale']/following::input)[1]")).sendKeys(input);
                break;
            case "Date de naissance" :
                getDriver().findElement(By.xpath("//input[@type='date']")).sendKeys(input);
                break;
            case "Numéro de téléphone" :
                getDriver().findElement(By.xpath("//input[@data-intl-tel-input-id='0']")).sendKeys(input);
                break;
            case "Adresse" :
                getDriver().findElement(By.xpath("(//label[text()='Adresse']/following::input)[1]")).sendKeys(input, Keys.RETURN);
                break;
            case "Adresse email" :
                getDriver().findElement(By.xpath("(//label[text()='Mail']/following::input)[1]")).sendKeys(input);
                break;
        }
    }

    @When("Je confirme la saisie de ses champs en cliquant sur Suivant")
    public void jeConfirmeLaSaisieDeSesChampsEnCliquantSurSuivant() {
        System.out.println("Je confirme la saisie de ses champs en cliquant sur Suivant");
        getDriver().findElement(By.xpath("(//button[@type='submit'])[1]")).click();
    }

    @Then("J'arrive sur la page Informations Fiscales")
    public void jArriveSurLaPageInformationsFiscales() {
        System.out.println("J'arrive sur la page Informations Fiscales");
        getDriver().findElement(By.xpath("//h2[text()='Informations fiscales']"));

    }

    @And("Je choisi mon type de rente: {string}")
    public void jeChoisiMonTypeDeRente(String type) {
        System.out.println("Etape - Je choisi mon type de rente");
        Select menuRente = new Select(getDriver().findElement(By.xpath("//div[@id='headerId']/div[1]/app-step1[1]/form[1]/section[2]/app-input-select[1]/div[1]/div[1]/select[1]")));
        menuRente.selectByVisibleText(type);
    }

}
