package com.shiv.poojan.RestAPITest;

import java.sql.SQLException;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
// @CucumberOptions(features = "classpath:Feature")
@CucumberOptions(strict=true,
				features= {"src\\main\\resources\\com\\shiv\\poojan\\module1\\module1.feature"},				
				format = { "html:target/cucumber-html-report", "json:target/cucumber-jsoninfo-report.json" },
				tags = { "@comp_City" },
				monochrome = true,
				glue= {"com.shiv.poojan.RestAPITest"}
				)

public class RunTest1 {

	public static void main(final String[] args) throws ClassNotFoundException, SQLException {
		final Result result = JUnitCore.runClasses(RunTest1.class);
		for (final Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}