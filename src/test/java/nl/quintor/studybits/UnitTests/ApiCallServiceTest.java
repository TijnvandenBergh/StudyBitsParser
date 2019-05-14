package nl.quintor.studybits.UnitTests;

import nl.quintor.studybits.business.ApiCallService;
import org.junit.Test;
import org.junit.Test;

import static io.restassured.RestAssured.when;
import static org.junit.Assert.*;


public class ApiCallServiceTest {

    ApiCallService apiCallService = new ApiCallService();
    @Test
    public void studentWithRightId() {

    //       String json = apiCallService.callService(2102241, "https://my-json-server.typicode.com/tijn167/FakeJsonApi", "/students/{id}");
    //       assert(json instanceof String);
    //       assert(!json.equals("{}"));
    }

    //Testing a non existing student
    @Test public void notExistingStudent() {
        when().
                get("https://my-json-server.typicode.com/tijn167/FakeJsonApi/students/12345555").
                then().
                        statusCode(404);
    }
}
