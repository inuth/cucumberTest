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
@removed
Feature: Is it Friday yet
  I want to know if the day is Friday
	
	@fast
  Scenario: the day is Friday
    Given The day is "2019-11-29"
    When I ask if it is Friday yet
    Then I get OK
    
   @slow
  Scenario Outline: the day is not Friday
  	Given The day is "<date>"
  	When I ask if it is Friday yet
  	Then I get KO
  
 		Examples: 
  		|date			 |
  		|2019-11-25|
  		|2019-11-26|
  		|2019-11-27|
  		|2019-11-28|
  		|2019-11-30|
  		|2019-12-01|
    
    
    
    
    