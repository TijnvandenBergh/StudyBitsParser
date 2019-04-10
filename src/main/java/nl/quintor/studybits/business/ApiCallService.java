package nl.quintor.studybits.business;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class ApiCallService {
    protected static final Logger logger = LogManager.getLogger();

    @Async
    public String callService(int id, String url, String endpoint){
        String fullUrl = url + endpoint;
        logger.info(fullUrl);
        String idVar = Integer.toString(id);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(fullUrl, String.class, idVar );
    }
}
