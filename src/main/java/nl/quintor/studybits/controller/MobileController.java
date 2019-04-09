package nl.quintor.studybits.controller;


import nl.quintor.studybits.business.Service;
import nl.quintor.studybits.entity.University;
import nl.quintor.studybits.manager.ServiceCallFactory;
import nl.quintor.studybits.repository.UniversityRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.Configuration;
import java.net.MalformedURLException;

@RestController
public class MobileController {
    protected static final Logger logger = LogManager.getLogger();

    @Autowired
    private UniversityRepository universityRepository;

    @Autowired
    ServiceCallFactory serviceCallFactory;

    @GetMapping(value = "/{university}/students/{id}")
    public String getStudent(@PathVariable("university") String university, @PathVariable("id") int id) throws MalformedURLException {
        University studentUniversity = universityRepository.findByName(university);
        String serviceCallName = studentUniversity.getUniversitySystem();
        Service desiredService = serviceCallFactory.getService(studentUniversity.getUniversitySystem());
        logger.info(desiredService.getName());
        return studentUniversity.getUniversitySystem();
    }
}
