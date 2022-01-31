package StepsDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\A105606\\OneDrive - Klesia\\Bureau\\CucumberSelenium\\src\\test\\resources\\Features\\US1 - Connexion"
        ,glue={"StepsDefinitions"}
        ,monochrome= true
        ,dryRun = true
)
class TestRunner {
}