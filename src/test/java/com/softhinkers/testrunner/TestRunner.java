package com.softhinkers.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions( glue = "com.softhinkers.stepdefinition" , features = "src/test/resources/",stepNotifications = true )
public class TestRunner {
}
