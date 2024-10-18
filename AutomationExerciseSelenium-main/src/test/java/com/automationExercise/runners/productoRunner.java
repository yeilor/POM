package com.automationExercise.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\com.automationExercise.features\\producto.feature",
        glue = "com.automationExercise.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class productoRunner {
}
