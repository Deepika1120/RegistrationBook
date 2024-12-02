package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/registration.feature","src/test/resources/search.feature"},
                 glue="com.stepdefinitionfile",
                 monochrome=true,
                 dryRun=false,
                 strict=true,
                 plugin={"pretty","html:target/html/HtmlReport.html","junit:target/JuniReports/JunitReports.xml","json:target/JsonReport/jsonReports.json"},
                 tags={"@Test1,@Test2"})
                 
                 
public class RunnerClass {
	

}
