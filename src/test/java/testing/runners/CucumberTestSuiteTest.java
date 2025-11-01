package testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        features = {
                "src/test/resources/features/search/01_TipoIdentUno.feature",
                "src/test/resources/features/search/02_NumIdentUno.feature",
                "src/test/resources/features/search/03_RolCliente.feature",
                "src/test/resources/features/search/04_TipoUno.feature",
                "src/test/resources/features/search/05_NumeUno.feature",
                "src/test/resources/features/search/06_RatingUno.feature",
                "src/test/resources/features/search/07_RatingDos.feature",
                "src/test/resources/features/search/08_RatingTres.feature",
                "src/test/resources/features/search/09_RatingCuatro.feature",
                "src/test/resources/features/search/10_CargaContinua.feature",
        },
        glue = "testing.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@tipo or @numero or @rol or @tipouno or @numeuno or @ratiuno or @ratidos or @ratitres or @raticuatro or @CarCont"
)
public class CucumberTestSuiteTest {}



