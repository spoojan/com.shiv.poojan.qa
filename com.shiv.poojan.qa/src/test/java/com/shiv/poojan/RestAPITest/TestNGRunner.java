package com.shiv.poojan.RestAPITest;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
// @CucumberOptions(features = "classpath:Feature")
@CucumberOptions(strict=true,
				features= {"src/main/resources/com/shiv/poojan/module1"},				
				format = { "html:target/cucumber-html-report", "json:target/cucumber-jsoninfo-report.json" },
				tags = { "@comp_City" },
				monochrome = true,
				glue= {"com.shiv.poojan.RestAPITest"}
				)


@Test
public class TestNGRunner extends AbstractTestNGCucumberTests{

}