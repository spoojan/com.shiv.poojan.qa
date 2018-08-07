package com.shiv.poojan;

import java.sql.SQLException;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "classpath:Feature")
@CucumberOptions(tags = { "@TCID_02" }, format = {
        "html:target/cucumber-html-report",
        "json:target/cucumber-jsoninfo-report.json" })

public class RunTests2 {

	public static void main(final String[] args) throws ClassNotFoundException, SQLException {
		final Result result = JUnitCore.runClasses(RunTests2.class);
		for (final Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}