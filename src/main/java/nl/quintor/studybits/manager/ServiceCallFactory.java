package nl.quintor.studybits.manager;

import nl.quintor.studybits.business.*;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceCallFactory {
    public Parser getService(String service) {
        if(service == null) {
            return null;
        }
        if(service.equalsIgnoreCase("Progress")) {
            return progressCreateService();
        }
        if(service.equalsIgnoreCase("Osiris")) {
            return osirisCreateService();
        }
        return null;
    }

    public OsirisParser osirisCreateService() {
        List<String> endpointsOsiris = new ArrayList<>();
        endpointsOsiris.add("/students");
        return new OsirisParser("OsirisParser", "https://my-json-server.typicode.com/tijn167/FakeJsonApi");
    }

    public ProgressParser progressCreateService() {
        List<String> endpointsProgress = new ArrayList<>();
        endpointsProgress.add("/students");
        return new ProgressParser("ProgressParser", "https://my-json-server.typicode.com/tijn167/FakeJsonApi");
    }

}
