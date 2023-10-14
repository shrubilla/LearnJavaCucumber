
Feature: Ebay filter verification
  

Scenario: Access a Product via category after applying multiple filters
Given User launched Ebay website
When  User navigate to Search by category
And  Selects Electronics > Cell Phones & accessories from left panel
And From All filters apply filters like - Condition, Price and Item location
Then The selected filter tags should be selected and applied


@Search
Scenario Outline: Access a Product via Search 
Given User launched Ebay website
When User search for <item> in search bar
And Change the Search category to category and perform search
Then Perform search for <item> and wait till page loads completely
And First result should match searched <item> string

Examples:
|item|
|Macbook|



Scenario Outline: Verify Login flow of invalid flow 
Given User launched Ebay website
When Navigate to sign in page
And Enters valid username <UserName>
And Enters valid password <Password>
Then User should login sucessfully

Examples: 
|UserName|Password|
|shruthi.bk99@gmail.com|Shruthib@123|


















 
