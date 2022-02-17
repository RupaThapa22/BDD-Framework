package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/featurefile"
,glue= {"stepdefination"}
,plugin = {"pretty", "html:target/htmlreports"}
)

public class testrunner {

}
