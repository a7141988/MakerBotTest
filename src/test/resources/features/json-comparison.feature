Feature: JSON Comparison

  Scenario: Comparing two JSON objects
    Given the original JSON at test-data/firstJSON.json
    And the JSON to compare at test-data/secondJSON.json
    When I compare the JSONs
    Then I should see the differences
