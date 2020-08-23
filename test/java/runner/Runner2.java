package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
			features = "src/test/java/features/login.feature",
			glue = {"stepDefinitions", "hooks111"},
			dryRun = !true,
			snippets = SnippetType.CAMELCASE,
			monochrome = true,
//			tags = {"@smoke"},
			plugin = {"pretty", "html:reports"}
		)
public class Runner2 extends AbstractTestNGCucumberTests{

}
