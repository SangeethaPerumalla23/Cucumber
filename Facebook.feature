
@tag
Feature: Facebook login creddientials
  I want to use this template to login the facebook
  
  @tag2
  Scenario Outline: 
    Given the user is the login page  
    When the user enters user name<uname> and password<password>
    Then User should be logged in successful
    

    Examples: 
      | uname        |   password      |   
      | "8008396527" |     Geetha@123  | 
      | "9949012998" |     "9989952254"|
      | "9989952254" |        Sange@123|
