package com.shiv.poojan.RestAPITest;

import java.io.File;
import java.lang.management.ManagementFactory;

import org.junit.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.shiv.poojan.beans.CityBean;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Module1RestAPITest extends RestAPITest {

	private String getAllCityUrl = restURL + "/medlife/customer/getAllCities";
	private CityBean cityBean;
	ExtentReports extent;
	ExtentTest logger;
	String scenarioName = "";

	@Before("@comp_City")
	public void init(final Scenario scenario) throws Exception {

		long threadId = Thread.currentThread().getId();
		String processName = ManagementFactory.getRuntimeMXBean().getName();
		System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);

		String testID = scenario.getName();
		System.out.println(testID);
		scenarioName = testID;
		cityBean = new CityBean();

		extent = new ExtentReports(System.getProperty("user.dir") + "\\test-output\\STMExtentReport.html", false);
		// extent.addSystemInfo("Environment","Environment Name")
		extent.addSystemInfo("Host Name", "SoftwareTestingMaterial").addSystemInfo("Environment", "Automation Testing")
				.addSystemInfo("User Name", "Shiv Poojan");
		// loading the external xml file (i.e., extent-config.xml) which was placed
		// under the base directory
		// You could find the xml file below. Create xml file in your project and copy
		// past the code mentioned below
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
	}

	@Given("^city name \"([^\"]*)\"$")
	public void city_name(final String cityName) throws Throwable {
		System.out.println(cityName);
		cityBean.setCity(cityName);
	}

	@When("^i get city details$")
	public void i_get_city_details() throws Throwable {
		System.out.println("Get city URI::" + getAllCityUrl);
		result = callGetUrlWithJsonObject(getAllCityUrl);
		System.out.println("Get city URI response::" + result.toString());
	}

	@Then("^city details should be found correctly$")
	public void city_details_should_be_found_correctly() {
		boolean flag = true;
		try {
			String cityList = result.getString("citylist");
			String city = cityBean.getCity();
			logger = extent.startTest("Start Test: " + scenarioName);
			// try {
			Assert.assertTrue(cityList.contains(city));
		} catch (Exception e) {
			flag = false;
		} catch (AssertionError e) {
			flag = false;
		}
		if (flag) {
			logger.log(LogStatus.PASS, "Test Case Passed is :" + scenarioName);
		} else {
			logger.log(LogStatus.FAIL, "Test Case Failed is :" + scenarioName);
		}
		System.out.println("City Name found in the list");
		extent.endTest(logger);
		extent.flush();
		extent.close();
	}

	@After("@comp_City")
	public void tearDown(final Scenario scenario) throws Exception {
		String testID = scenario.getName();
		System.out.println("In tearDown Method::" + testID);

	}

}
