package nl.quintor.studybits.IntegrationTests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import static junit.framework.TestCase.assertTrue;


//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class MobileControllerTest {
//
//    protected static final Logger logger = LogManager.getLogger();
//    @LocalServerPort
//    private int port;
//
//    TestRestTemplate restTemplate = new TestRestTemplate();
//    HttpHeaders headers = new HttpHeaders();
//
////    @Test
////    public void testGetStudent() throws Exception {
////        String uri = "/{university}/students/{id}";
////        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
////        ResponseEntity<String> response = restTemplate.exchange(
////        createURLWithPort(uri), HttpMethod.GET, entity, String.class);
////        String actual = response.getHeaders().get(HttpHeaders.LOCATION).get(0);
////        assertTrue(actual.contains("/{university}/students/{id}"));
////    }
////
////    private URI createURLWithPort(String uri) throws URISyntaxException {
////        String url = "http://localhost:" + port + uri;
////        UriComponentsBuilder builder = UriComponentsBuilder.fromPath(url);
////        UriComponents uriComponents = builder.build();
////        URI uri1 = new URI("http", null,"localhost", port,  "{university}/students/{id}", null, null);
////        return uri1;
////    }
//}
