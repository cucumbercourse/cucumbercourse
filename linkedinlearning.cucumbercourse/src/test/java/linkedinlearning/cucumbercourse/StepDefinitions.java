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
         
         System.out.println(options.toString());
     

        //options("--no-sandbox");
        options.addArguments("--no-sandbox");
        options.addArguments("--user-data-dir='usr/bin/alt'");
       //WebDriver driver = WebDriverManager.chromedriver().create();
       

        WebDriver driver = new ChromeDriver(options);
        driver = new ChromeDriver(options);

    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}
