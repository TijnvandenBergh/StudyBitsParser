package nl.quintor.studybits.controller;


import nl.quintor.studybits.entity.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MobileController {
    protected static final Logger logger = LogManager.getLogger();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting() throws MalformedURLException {
        URL url = new URL("https://my-json-server.typicode.com/tijn167/FakeJsonApi/students");
        try {
            URLConnection connection = url.openConnection();
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
        } catch (IOException e) {
            logger.debug(e.getMessage());
        }
        return "hoi";
    }
}
