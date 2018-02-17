package JSON;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class JSONComparisonStepDefinitions {
    private JSONComparisonSteps JSONSteps = new JSONComparisonSteps();
    private String JSONone;
    private String JSONtwo;

    @Given("^the original JSON at (.*)$")
    public void originalJSON(String filePath) throws Exception {
        JSONone =  JSONSteps.storeJSONAsString(filePath);
    }

    @Given("^the JSON to compare at (.*)$")
    public void JSONtoCompare(String filePath) throws Exception {
        JSONtwo =  JSONSteps.storeJSONAsString(filePath);
    }

    @When("^I compare the JSONs$")
    public void compareJSONs() {
        System.out.println("Comparing JSONs...see Assertion Errors for differences:");
    }

    @Then("^I should see the differences$")
    public void showDifferences() throws Exception {
        JSONSteps.compareJSONs(JSONone, JSONtwo, false);
    }
}
