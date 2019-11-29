#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: calcul total to pay with new customers discount
  A client can purchase products

  Scenario: A new client purchase a product
    Given A new client "John Doe"
    	And a "banana" at 1.5
    When I calculate the amount
    Then the amount to pay is 1.2
    
  Scenario: A new client purchase many products
		Given A new client "John Doe"
    	And a "banana" at 1.5
    	And a "packet of chocolate" at 10.0
    When I calculate the amount
    Then the amount to pay is 9.5 
    
    
    
    