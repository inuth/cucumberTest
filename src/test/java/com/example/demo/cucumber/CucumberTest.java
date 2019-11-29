package com.example.demo.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/example/demo/cucumber/features",
plugin = {"pretty", "junit:TestCucumber/Cucumber.xml"},
dryRun = true,
snippets = SnippetType.UNDERSCORE,
strict = true,
tags = {"@fast","~@removed"}
)
public class CucumberTest {
}
