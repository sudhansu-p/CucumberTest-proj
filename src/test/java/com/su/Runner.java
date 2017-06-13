package com.su;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

		format = { "pretty", "jeson:target/" }, 
		features = { "Feature_Repo/Test001.feature" }

)
public class Runner {

}
