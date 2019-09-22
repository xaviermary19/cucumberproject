package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\antoj\\eclipse-workspace\\cucumberproject\\resources\\features\\LoginTest.feature"},
glue= {"com.stepdefinitions"},dryRun=false)

public class RunCukeTest {

}
