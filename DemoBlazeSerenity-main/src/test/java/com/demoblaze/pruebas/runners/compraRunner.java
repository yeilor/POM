package com.demoblaze.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\com.demoblaze.pruebas.features",
        glue = "com.demoblaze.pruebas.stepDefinitions",
        snippets = SnippetType.CAMELCASE)

public class compraRunner {
}
