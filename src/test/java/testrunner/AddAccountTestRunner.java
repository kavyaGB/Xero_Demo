package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin = {"json:target/negative/cucumber.json", "pretty", "html:target/negative/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = ".\\feature\\AddAccount.Feature",
        glue = {"stepDefinition"} 
        //tags = {"@AddAccount"}        
        )


public class AddAccountTestRunner {

}

