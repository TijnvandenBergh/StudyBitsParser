package nl.quintor.studybits.controller;


import com.google.gson.Gson;
import nl.quintor.studybits.entity.University;
import nl.quintor.studybits.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    UniversityRepository universityRepository;

    @GetMapping(value = "/universities")
    public String getAllUniversities() {
        List<University> universityList = universityRepository.findAll();
        Gson gson = new Gson();
        return gson.toJson(universityList);
    }
}
