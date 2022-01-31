package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class US2_CAS7 extends DriverSuperClass {

    @Given("Je rafraichi la page")
    public void jeRafraichiLaPage(){
        System.out.println("Etape - Je rafraichi la page");
        getDriver().navigate().refresh();
    }

    @And("Je supprime le champ {string}")
    public void jeSupprimeLeChamp(String champ) throws InterruptedException {
        switch (champ){
            case "Nom de naissance" :
                getDriver().findElement(By.xpath("(//label[text()='Nom de naissance']/following::input)[1]")).clear();
                getDriver().findElement(By.xpath("(//label[text()='Nom de naissance']/following::input)[1]")).sendKeys("a", Keys.BACK_SPACE);
                break;
            case "Prénom" :
                getDriver().findElement(By.xpath("(//label[text()='Prénom']/following::input)[1]")).clear();
                getDriver().findElement(By.xpath("(//label[text()='Prénom']/following::input)[1]")).sendKeys("a", Keys.BACK_SPACE);
                break;
            case "NIR" :
                getDriver().findElement(By.xpath("(//label[text()='Numéro de sécurité sociale']/following::input)[1]")).clear();
                getDriver().findElement(By.xpath("(//label[text()='Numéro de sécurité sociale']/following::input)[1]")).sendKeys("1", Keys.BACK_SPACE);
                break;
            case "Date de naissance" :
                getDriver().findElement(By.xpath("//input[@type='date']")).clear();
                getDriver().findElement(By.xpath("//input[@type='date']")).sendKeys("1", Keys.BACK_SPACE);
                break;
            case "Numéro de téléphone" :
                getDriver().findElement(By.xpath("//input[@data-intl-tel-input-id='0']")).clear();
                getDriver().findElement(By.xpath("//input[@data-intl-tel-input-id='0']")).sendKeys("1", Keys.BACK_SPACE);
                break;
            case "Adresse" :
                getDriver().findElement(By.xpath("(//label[text()='Adresse']/following::input)[1]")).clear();
                getDriver().findElement(By.xpath("(//label[text()='Adresse']/following::input)[1]")).sendKeys("a", Keys.BACK_SPACE);
                break;
            case "Adresse email" :
                getDriver().findElement(By.xpath("(//label[text()='Mail']/following::input)[1]")).clear();
                getDriver().findElement(By.xpath("(//label[text()='Mail']/following::input)[1]")).sendKeys("a", Keys.BACK_SPACE);
                break;
        }
    }

    @Then("Ce champ est obligatoire apparait")
    public void ceChampEstObligatoireApparait() {
        System.out.println("Etape - Ce champ est obligatoire apparait");
        getDriver().findElement(By.xpath("//small[text()=' Ce champ est obligatoire. ']"));
    }

}
