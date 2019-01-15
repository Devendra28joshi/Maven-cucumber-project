package runnableClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/MavenTest/src/test/java/runnableClass"
		,glue="stepDefinitions"
		,plugin = {"json:target/cucumber-report/cucumber.json"}
		)

public class Runnableclass {

}
