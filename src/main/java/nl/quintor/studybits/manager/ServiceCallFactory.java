package nl.quintor.studybits.manager;

import nl.quintor.studybits.business.*;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceCallFactory {
    public Service getService(String service) {
        if(service == null) {
            return null;
        }
        if(service.equalsIgnoreCase("Progress")) {
            return ProgressCreateService();
        }
        if(service.equalsIgnoreCase("Osiris")) {
            return OsirisCreateService();
        }
        return null;
    }

    public OsirisService OsirisCreateService() {
        List<String> endpointsOsiris = new ArrayList<>();
        endpointsOsiris.add("/students");
        return new OsirisService("OsirisService", "https://my-json-server.typicode.com/tijn167/FakeJsonApi", endpointsOsiris);
    }

    public ProgressService ProgressCreateService() {
        List<String> endpointsProgress = new ArrayList<String>();
        endpointsProgress.add("/students");
        return new ProgressService("ProgressService", "https://my-json-server.typicode.com/tijn167/FakeJsonApi");
    }

}
