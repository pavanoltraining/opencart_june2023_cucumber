Feature: Login Data Driven Scenario Background

	Background: User is Logged In
		Given User Launch browser
  	And opens URL "https://tutorialsninja.com/demo/"
  	When User navigate to MyAccount menu
  	And click on Login

@regression
  Scenario Outline: Login Data Driven
    #Given User Launch browser
    #And opens URL "https://tutorialsninja.com/demo/"
    #When User navigate to MyAccount menu
    #And click on Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User navigates to MyAccount Page

    Examples: 
      | email                	    | password |
      | pavanol@gmail.com         | test123  |
      | pavanoltraining@gmail.com | test@123 |


	Scenario Outline: Login Data Driven Excel
    #Given User Launch browser
    #And opens URL "https://tutorialsninja.com/demo/"
    #When User navigate to MyAccount menu
    #And click on Login
    Then check User navigates to MyAccount Page by passing Email and Password with excel row "<row_index>"

    Examples:
      |row_index|
      |1|
      |2|
      |3|
