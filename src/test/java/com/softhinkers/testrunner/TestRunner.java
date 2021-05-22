package com.softhinkers.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.softhinkers.stepdefinition", features = "src/test/resources/",
        stepNotifications = true,
        plugin = {"pretty" , "html:target/cucumber.html","json:target/cucumber.json",
        "junit:target/cucumber.xml"} , dryRun = true , monochrome = true)
//pretty is used for the purpose of giving colors  to the reports results
//tags = "@SmokeTest or @RegTest")
//tags = "not @SanityTest" if you don't want to execute @sanityTest we can  write like this also
//tags = "@RegTest and @SmokeTest" If you want all scenarios to run who comes under @regtest and @smoketest
//tags = "@RegTest , @SmokeTest"


// Cucumber dry run is basically used to compile cucumber feature files and step Definitions.
// If there is any compilation errors it will show when we use dry run.
//It is specially used in the stage when you will have to see if there are any compilation errors,
// to check that you can use dry-run. Dry-run options can either set as true or false.



//We use monochrome option inside @CucumberOptions annotation.his option can either set as true or false. true:
// it means that the console output for the Cucumber test are much more readable and remove
// any unreadable character. false: then the console output is not as readable as it should be.
public class TestRunner {

}
