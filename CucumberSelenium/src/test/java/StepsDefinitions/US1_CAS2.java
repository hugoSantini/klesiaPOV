package StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class US1_CAS2 extends DriverSuperClass {

    @Given("Mon navigateur et ouvert avec cookies")
    public void mon_navigateur_et_ouvert_avec_cookies() {

        System.out.println("Etape - Mon navigateur est ouvert");
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        setupChromeDriver(true);
    }

    @Then("Un message d'erreur s'affiche")
    public void un_message_d_erreur_s_affiche() {

        System.out.println("Etape - Check message d'erreur");
        getDriver().findElement(By.xpath("//div[@class='alert alert-error']"));
    }

}
