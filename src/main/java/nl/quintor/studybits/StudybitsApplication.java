package nl.quintor.studybits;


import nl.quintor.studybits.business.IServiceCall;
import nl.quintor.studybits.business.ProgressServiceCall;
import nl.quintor.studybits.manager.DataDeserializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StudybitsApplication {

    protected static final Logger logger = LogManager.getLogger();

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public Seeder seed;

    public static void main(String[] args) {
        List<String> endpointsProgress = new ArrayList<String>();
        endpointsProgress.add("/students");
        ProgressServiceCall progressServiceCall = new ProgressServiceCall("ProgressServiceCall", "https://my-json-server.typicode.com/tijn167/FakeJsonApi", endpointsProgress);
        DataDeserializer.getInstance().registerParser(progressServiceCall);
        List<IServiceCall> serviceCalls = DataDeserializer.getInstance().getDataAdapterList();
        for (IServiceCall e: serviceCalls) {
            logger.info(e.getName());
        }
        SpringApplication.run(StudybitsApplication.class, args);
    }

}
