package nl.quintor.studybits.controller;


import nl.quintor.studybits.business.Parser;
import nl.quintor.studybits.entity.University;
import nl.quintor.studybits.manager.ServiceCallFactory;
import nl.quintor.studybits.repository.UniversityRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
    protected static final Logger logger = LogManager.getLogger();

    @Autowired
    private UniversityRepository universityRepository;

    @Autowired
    ServiceCallFactory serviceCallFactory;

    @GetMapping(value = "/{university}/students/{id}")
    public String getStudent(@PathVariable("university") String university, @PathVariable("id") int id) {
        University studentUniversity = universityRepository.findByName(university);
        Parser desiredParser = serviceCallFactory.getService(studentUniversity.getUniversitySystem());
        desiredParser.parseStudent(id);
        return studentUniversity.getUniversitySystem();
    }
}
