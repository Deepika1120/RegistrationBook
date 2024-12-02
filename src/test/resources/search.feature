Feature: Search and Filter

  @Test2
  Scenario: Perform a search and apply filters
    Given I navigate to the search page
    When I search for Events
    And I apply the Destination and Select dates and PriceRange filter
    Then I should see filtered search results
    
   
