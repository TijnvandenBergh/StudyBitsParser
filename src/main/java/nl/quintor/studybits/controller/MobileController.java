package nl.quintor.studybits.controller;


import nl.quintor.studybits.business.IServiceCall;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.University;
import nl.quintor.studybits.manager.DataDeserializer;
import nl.quintor.studybits.repository.UniversityRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class MobileController {
    protected static final Logger logger = LogManager.getLogger();
    DataDeserializer dataDeserializer = DataDeserializer.getInstance();

    @Autowired
    private UniversityRepository universityRepository;

    @GetMapping(value = "/{university}/students/{id}")
    public String getStudent(@PathVariable("university") String university, @PathVariable("id") int id) throws MalformedURLException {
        University studentUniversity = universityRepository.findByName(university);

//        for(IServiceCall serviceCall : dataDeserializer.getDataAdapterList()) {
//            if (serviceCall.getName() == )
//
//        }
        return studentUniversity.getUniversitySystem();
    }
}
