package com.su;

import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test {
	
	public static String baseURI;
	public Response ResP;
	public static ExtentTest test;
	static ExtentHtmlReporter htmlReporter;
	static String RootFolder = System.getProperty("user.dir");
	public static ExtentReports extent = new ExtentReports();
	static Properties Property = new Properties();
	ExtentTest scenario;
	String URI;
	ExtentTest Extst;
	RequestSpecification Rsp;
	
	@Given("^URI is \"([^\"]*)\"$")
	public void uri_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("hi");
	}

	@When("^Perform GET request$")
	public void perform_GET_request() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello");
	}

	@Then("^Validate response \"([^\"]*)\"$")
	public void validate_response(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Bye");
	}

}
