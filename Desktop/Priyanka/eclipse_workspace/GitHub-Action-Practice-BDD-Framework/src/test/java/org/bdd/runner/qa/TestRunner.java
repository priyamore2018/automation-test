package org.bdd.runner.qa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features/SauceLogin.feature",
		glue =  "org.bdd.stepdefination.qa",
		plugin = {"pretty","html:target/cucumber-reports.html" ,"json:target/cucumber-reports.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
