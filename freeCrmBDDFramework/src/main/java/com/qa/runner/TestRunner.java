package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		format= {"pretty", "html:reports/execution_reports", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		features= {"src/main/java/com/qa/features/"},
		glue= {"com/qa/steps_definitions"},
		tags= {"@sanity"},
		monochrome=true,
		strict=true,
		dryRun=false
		)

public class TestRunner {

}
