package linkedinlearning.cucumbercourse;

import io.cucumber.java.en.*;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome;



public class StepDefinitions {

   static protected WebDriver driver;



    @Given("an example scenario")
    public void anExampleScenario() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        //options.addArguments("--user-data-dir=alt");
        WebDriver driver = new ChromeDriver(options);

    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}
