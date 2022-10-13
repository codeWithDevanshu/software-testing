package org.example.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"src/test/resources/Featuers"},

        glue = {"org/example/stepDefination"}

        ,   tags="@Test5"

        , dryRun = false

)



public class testRunner {
}
