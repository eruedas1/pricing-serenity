package testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        features = {
                "src/test/resources/features/search/Loginsfeatures.feature",
                "src/test/resources/features/search/LoginPage.feature",
                "src/test/resources/features/search/Loginsfeatures3.feature",

        },
        glue = "testing.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = " " //Tag para correr escenarios especificos de cada feature
)
public class CucumberTestSuiteTest {}



