package StepsDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US2_CAS2 extends DriverSuperClass{
    @And("Le champ {string} est présent et est de type {string}")
    public void leChampEstPrésentEtEstDeType(String champ, String type) {

        String typeHTML = "";
        if(type == "Bouton Radio") {typeHTML = "radio";}
        else if(type == "Champ de saisie"){typeHTML = "text";}
        else if(type == "Calendrier"){typeHTML = "date";}
        else if(type == "Liste déroulante"){typeHTML = "select";}

        String actualType = "";
            if(champ =="Civilité") {
                actualType = getDriver().findElement(By.xpath(("(//label[text()='Civilité']/following::input)[1]"))).getAttribute("type");
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
            else if(champ == "Nom de Naissance"){
                actualType = getDriver().findElement(By.xpath(("(//label[text()='Nom de naissance']/following::input)[1]"))).getAttribute("type");
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
            else if(champ == "Prénom"){
                actualType = getDriver().findElement(By.xpath(("(//label[text()='Prénom']/following::input)[1]"))).getAttribute("type");
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
            else if(champ == "Numéro de sécurité sociale"){
                actualType = getDriver().findElement(By.xpath(("(//label[text()='Numéro de sécurité sociale']/following::input)[1]"))).getAttribute("type");
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
            else if(champ == "Date de naissance"){
                actualType = getDriver().findElement(By.xpath(("(//label[text()='Date de naissance']/following::input)[1]"))).getAttribute("type");
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
            else if(champ == "Numéro de téléphone"){
                actualType = getDriver().findElement(By.xpath(("(//label[text()='Téléphone']/following::input)[1]"))).getAttribute("type");
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
            else if(champ == "Adresse mail"){
                actualType = getDriver().findElement(By.xpath(("(//label[text()='Mail']/following::input)[1]"))).getAttribute("type");
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
            else if(champ == "Adresse"){
                actualType = getDriver().findElement(By.xpath(("(//label[text()='Adresse']/following::input)[1]"))).getAttribute("type");
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
            else if(champ == "Résidence a l'étranger"){
                actualType = getDriver().findElement(By.xpath(("(//span[text()='+358'])[2]/following::input)[4]"))).getAttribute("type");
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
            else if(champ == "Type de rente"){
                actualType = getDriver().findElement(By.xpath(("//div[contains(@class,'input ng-invalid')]//select[1]"))).getTagName();
                System.out.println("ActualType : " + actualType + "TypeHTML :" + typeHTML);
                Assert.assertEquals(actualType, typeHTML);
            }
        }
}

