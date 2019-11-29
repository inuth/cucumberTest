package com.example.demo.cucumber.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.example.demo.models.Client;
import com.example.demo.models.Product;
import com.example.demo.service.PurchaseService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculTotalWithNewCustomerDiscountSteps {
	Client client;
	List<Product> products = new ArrayList<>();
	PurchaseService ps = new PurchaseService();
	double total;
	/*
	 * Given A new client "John Doe"
    	And a banana at 1.5
    When I calcule the amount
    Then the amount to pay is 1.2
    */
	
	@Given("A new client {string}")
	public void aNewClient(String name) {
		client = new Client();
		client.setName(name);
		client.setNewClient(true);
	}
	
	@Given("a {string} at {float}")
	public void aProductAt(String name, float price) {
		products.add(new Product(name, price));
	}
	
	@When("I calculate the amount")
	public void iCalculateTheAmount() {
		total = ps.calculTotal(client, products);
	}
	
	@Then("the amount to pay is {float}")
	public void theAmountToPayIs(float totalPrice) {
		Assert.assertEquals(totalPrice, total, 0.01);
	}
}
