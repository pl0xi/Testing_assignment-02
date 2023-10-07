package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/org/example",
        plugin = {"pretty"},
        glue = {"org.example"}
)
public class CucumberRunnerTest {
}
