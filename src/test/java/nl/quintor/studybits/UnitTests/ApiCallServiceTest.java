package nl.quintor.studybits.UnitTests;

import nl.quintor.studybits.business.ApiCallService;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;


public class ApiCallServiceTest {

    ApiCallService apiCallService = new ApiCallService();
    @Test
    public void studentWithRightIdReturnsJson() {
       String json = apiCallService.callService(2102241, "https://my-json-server.typicode.com/tijn167/FakeJsonApi", "/students/{id}");
       assert(json instanceof String);
       assert(!json.equals("{}"));
    }

//    @Test public void notExistingStudent() {
//        String json = apiCallService.callService(123456, "https://my-json-server.typicode.com/tijn167/FakeJsonApi", "/students/{id}");
//        assert(json instanceof String);
//        assert(json.equals("{}"));
//    }
}
