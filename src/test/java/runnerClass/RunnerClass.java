package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Janaki\\eclipse-workspace\\CucumberMay19\\src\\test\\resources\\DataTable.feature",
glue ="DatatestDef" )

public class RunnerClass {
	

}
