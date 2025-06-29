package api;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ConfigReader;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ApiStepDefs {
    private Response response;

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        String baseUrl = ConfigReader.get("api.base.url");
        response = RestAssured.get(baseUrl + endpoint);
    }

    @Then("the response status code should be 200")
    public void the_response_status_code_should_be_200() {
        assertEquals(response.getStatusCode(), 200);
    }

    @Then("the response should contain a list of todos")
    public void the_response_should_contain_a_list_of_todos() {
        assertTrue(response.jsonPath().getList("id").size() > 0);
    }
}
