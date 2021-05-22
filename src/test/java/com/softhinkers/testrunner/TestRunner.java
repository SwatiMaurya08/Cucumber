package com.softhinkers.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.softhinkers.stepdefinition", features = "src/test/resources/",
        stepNotifications = true) //tags = "@SmokeTest or @RegTest")
//tags = "not @SanityTest" if you don't want to execute @sanityTest we can  write like this also
//tags = "@RegTest and @SmokeTest" If you want all scenarios to run who comes under @regtest and @smoketest
//tags = "@RegTest , @SmokeTest"
public class TestRunner {

}
