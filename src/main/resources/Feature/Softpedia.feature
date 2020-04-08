@softpedia
Feature: softpedia Website

  @TC01_01
 Scenario Outline: Login in the softpedia Website
 	Given Launch the softpedia website
	Then User clicks on the Login button
	And user enters"<username>" and "<password>" 
	And Exit the browser
	Examples: 
      | username                | password      | 
      | abhishek12052@gmail.com |     Abhi@1234 | 
      
  @TC02_02
  Scenario: Search in the softpedia appliaion
 Given Launch the sf application
 And User enter the required item in search button and click on search
 And  the browser is closed
 
 @TC03_03
  Scenario: user can play the games in this softpedia application
  Given Launch the softpedia applicaion
  And The user can play the games on click to the GAMES
  And Exit the sf browser
  
  @TC04_04
  Scenario: user can read the DRIVERS in this softpedia application
  Given Launch the sp applicaion
  And The user on click to the DRIVERS in the application
  And Browser is quit