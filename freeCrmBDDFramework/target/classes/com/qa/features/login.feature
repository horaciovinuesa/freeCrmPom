#Author: your.email@your.domain.com
# The objective of this project is to apply the different cucumber features 
# Cucumber options
# Data driven testing
# Data tables
# Data driven with maps
# Tags
# Hooks
# Apply POM to the project

#The test suite is executed using smoke and sanity tags, the list of features is the following 
#Each feature (except login) should contain as much scenarios as possible
# Login
# Logout
# Create contact
# Create deal
# Create task
# Create case
# Verify left panel links
# Search for deals, contact, case, task, email, docs, forms, report


Feature: Login
  I want to be able to loging to freecrm page

  @sanity
  Scenario: Title of your scenario
    Given user is on crm login page
    And user fills in the login credentials
    When User clicks on login
    Then The homepage is displayed
    And User is logged in

