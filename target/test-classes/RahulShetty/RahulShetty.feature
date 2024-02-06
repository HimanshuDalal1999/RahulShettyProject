Feature: Verify Rahul Shetty application


Background:
Given User should be at Home Page
When User clicks on Practice button
And User clicks on Automation-Practice button

Scenario: Verify Radio button is clickable or not
When User clicks on options in Radio button
Then Option in Radio button is get selected

Scenario: Verify Suggestion Box
When User Enters value inside Suggestion Box as "Ind"
Then India options is get suggested in Suggestion box

Scenario: Verify Dropdown Element
When User clicks on Dropdown box
And User clicks on option in Dropdown box
Then Option from Dropdown box is get selected

Scenario: Verify Checkbox 
When User selects options from Checkbox
Then Options from Checkbox is get selected
