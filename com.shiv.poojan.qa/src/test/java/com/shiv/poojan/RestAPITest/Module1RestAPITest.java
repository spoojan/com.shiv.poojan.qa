package com.shiv.poojan.RestAPITest;

import java.lang.management.ManagementFactory;

import org.junit.Assert;

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

	@Before("@comp_City")
	public void init(final Scenario scenario) throws Exception {
		

		    long threadId = Thread.currentThread().getId();
		    String processName = ManagementFactory.getRuntimeMXBean().getName();
		    System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);
		
		
		String testID = scenario.getName();
		System.out.println(testID);
		cityBean = new CityBean();
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
	public void city_details_should_be_found_correctly() throws Throwable {
		String cityList = result.getString("citylist");
		String city = cityBean.getCity();
		Assert.assertTrue(cityList.contains(city));
		System.out.println("City Name found in the list");
	}

	@After("@comp_Connections")
	public void tearDown(final Scenario scenario) throws Exception {
		String testID = scenario.getName();
		System.out.println(testID);
	}

}
