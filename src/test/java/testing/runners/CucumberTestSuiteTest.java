package testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        features = {
                "src/test/resources/features/search/LoginPage.feature",
        },
        glue = "testing.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@ValidCredentialsAndCotizador" //Tag para correr escenarios especificos de cada feature
)
public class CucumberTestSuiteTest {}



