package io.gorest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", plugin = {"pretty"}, glue = "io.gorest.glue.definitions")
public class CucumberIntegrationTest  {
}
