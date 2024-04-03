package starter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        plugin = {"pretty"},
        //features = "src/test/resources/features/card",
        //features = "src/test/resources/features/Shopping/Write&ReadExcel.feature",
        features = "src/test/resources/features/Documents/ReadDocuments.feature",
        tags = "@Test"
)
public class CatalogTestSuite {
}
