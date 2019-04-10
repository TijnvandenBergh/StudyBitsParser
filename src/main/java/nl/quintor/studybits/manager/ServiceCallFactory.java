package nl.quintor.studybits.manager;

import nl.quintor.studybits.business.*;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceCallFactory {
    public Service getService(String service) {
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

    public OsirisService osirisCreateService() {
        List<String> endpointsOsiris = new ArrayList<>();
        endpointsOsiris.add("/students");
        return new OsirisService("OsirisService", "https://my-json-server.typicode.com/tijn167/FakeJsonApi");
    }

    public ProgressService progressCreateService() {
        List<String> endpointsProgress = new ArrayList<>();
        endpointsProgress.add("/students");
        return new ProgressService("ProgressService", "https://my-json-server.typicode.com/tijn167/FakeJsonApi");
    }

}
