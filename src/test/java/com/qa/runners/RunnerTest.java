package com.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "html:target/cucumber-pretty.html","summary"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"com/qa/stepdef"}
)
public class RunnerTest {
}
