package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\Sangeetha\\Desktop\\ProjectWorkspace\\Cucumber\\hooks.feature",  // Path to your feature files
    glue = "stepDefinitions",
    plugin = {
            "pretty","html:C:\\Users\\Sangeetha\\Desktop\\ProjectWorkspace\\Cucumber\\Reports\\report1.html",
        }
   
)

public class TestCucumber {

}
