package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/testdesign","src/test/resources/demo"},
        glue = {"stepdef","hookspack"},
        tags = "@mutliple",
        plugin = {"pretty"}
)

public class Runner {
}
