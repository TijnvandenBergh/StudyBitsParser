package nl.quintor.studybits.controller;


import nl.quintor.studybits.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MobileController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting() throws MalformedURLException {
        URL url = new URL("https://my-json-server.typicode.com/tijn167/FakeJsonApi/students");
        try {
            URLConnection connection = url.openConnection();
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hoi";
    }
}
