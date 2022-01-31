package StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class allFeaturesUS1 extends DriverSuperClass{

    @Given("Mon navigateur et ouvert sans cookies")
    public void mon_navigateur_et_ouvert_sans_cookies() {
        System.out.println("Etape - Mon navigateur est ouvert");
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        setupChromeDriver(false);
    }

    @Given("Je suis sur la page de connexion du formulaire d'imposition")
    public void je_suis_sur_la_page_de_connexion_du_formulaire_d_imposition() {
        System.out.println("Etape - Je suis sur la page de connexion");
        getDriver().navigate().to("https://re7-contact.klesia.fr/form");
    }

    @When("Je rentre mon identifiant : {string}")
    public void je_rentre_mon_identifiant(String ID) {
        System.out.println("Etape - Rentrer l'ID");
        System.out.println("Mon identifiant est : " + ID);
        getDriver().findElement(By.id("username")).sendKeys(ID);


    }
    @When("Je rentre mon mdp : {string}")
    public void je_rentre_mon_mdp(String MDP) {
        System.out.println("Etape - Rentrer le MDP");
        System.out.println("Mon Mot de Passe est : " + MDP);
        getDriver().findElement(By.id("password")).sendKeys(MDP);

    }

    @When("J'appuye sur 'Se connecter'")
    public void j_appuye_sur_se_connecter() {
        System.out.println("Etape - Cliquer sur \"Se connecter\"");
        getDriver().findElement(By.name("login")).click();
    }

    @Then("J'arrive sur la page première page du formulaire")
    public void j_arrive_sur_la_page_première_page_du_formulaire() {
        System.out.println("J'arrive sur la premier page du formulaire");
        String currentURL = getDriver().getCurrentUrl();
        Assert.assertEquals("https://re7-contact.klesia.fr/form", currentURL);
    }
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
    @When("Je clique sur la zone S'authentifier via FranceConnect")
    public void je_clique_sur_la_zone_s_authentifier_via_france_connect(){
        System.out.println("Etape - Je clique sur le bouton FranceConnect");
        System.out.print(getDriver().findElement(By.xpath("//body")).getAttribute("innerHTML"));
        getDriver().findElement(By.xpath("//div[@class='kl-login-ent']//a")).click();
    }

    @Then("La page d’identification FranceConnect s'ouvre correctement")
    public void la_page_d_identification_france_connect_s_ouvre_correctement() {
        System.out.println("Etape - Rentrer l'ID");
        String currentURL = getDriver().getCurrentUrl();
        currentURL = currentURL.substring(0,47);
        System.out.println(currentURL);
        Assert.assertEquals("https://fcp.integ01.dev-franceconnect.fr/api/v1", currentURL);
    }
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
    @When("Je clique sur Identifiant oublié,")
    public void jeCliqueSurIdentifiantOublié() {
        System.out.println("Etape - Clique sur ID oublié");
        getDriver().findElement(By.xpath("//div[@class='form-group login-pf-settings']//a[1]")).click();
    }

    @Then("La procédure d'identifiant oublié démarre.")
    public void la_procédure_d_identifiant_oublié_démarre() {
        System.out.println("Etape - La procédure d'identifiant oublié démarre");
        getDriver().findElement(By.xpath("//div[@class='kl-forgot-user-form']"));
    }
    @When("J'accede a la mire de connexion")
    public void j_accede_a_la_mire_de_connexion() {
        System.out.println("Etape - J'accède a la mire de connexion");
        getDriver().navigate().to("https://re7-contact.klesia.fr/form");
    }
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

