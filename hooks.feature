

Feature: Instagram Login functionality
	
	@smoke
  Scenario: Login with valid credentials
  
    Given user enter instavalid credentials
    Then click on instagram_signIn button
   
 Scenario: Login with in-valid credentials
    Given user enter instain-valid credentials
    Then click on instagram_signIn button