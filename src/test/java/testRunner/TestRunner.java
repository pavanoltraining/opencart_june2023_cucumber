package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					//features= {".//Features/"},
					//features= {".//Features/LoginDDT.feature"},
					//features= {".//Features/Login.feature",".//Features/xyz.feature"},
					//features= {".//Features/LoginDDTExcel.feature"},
					features= {".//Features/Login.feature"},
					//features= {"@target/rerun.txt"},
					glue="stepDefinitions",
					plugin= {
							"pretty", "html:reports/myreport.html",
							 "rerun:target/rerun.txt"  // to capture failures
							},
					dryRun=false,
					tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

}
