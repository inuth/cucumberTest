package com.example.demo.cucumber.steps;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.Assert;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IsItFridayYetSteps {
	
	private String isItFriday(LocalDate date) {
		return date.getDayOfWeek() == DayOfWeek.FRIDAY ? "OK" : "KO";
	}
	
	LocalDate date;
	String response;
	
	@Given("The day is {string}")
	public void theDayIs(String date) {
		this.date = LocalDate.parse(date);
	}
	@Given("I say hi")
	public void hi() {
		throw new PendingException();
	}
	@When("I ask if it is Friday yet")
	public void iAskIfItIsFridayYet() {
		response = isItFriday(date);
	}
	@Then("I get {word}")
	public void iGet(String expectedResponse) {
		Assert.assertEquals(expectedResponse, this.response);
	}
}
