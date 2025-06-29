package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/saucedemo_login.feature", "src/test/resources/api_get_todos.feature"},
    glue = {"ui.steps", "api"}
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
