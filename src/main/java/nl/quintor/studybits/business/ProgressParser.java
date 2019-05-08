package nl.quintor.studybits.business;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.quintor.studybits.entity.ExchangePosition;
import nl.quintor.studybits.entity.Student;
import nl.quintor.studybits.entity.Transcript;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import java.io.IOException;


@Getter
@Setter
@NoArgsConstructor
public class ProgressParser extends Parser {
    protected static final Logger logger = LogManager.getLogger();

    private static final String URL_PROGRESS = "https://my-json-server.typicode.com/tijn167/FakeJsonApi";
    private static final String STUDENT_BY_ID_ENDPOINT = "/students/{id}";

    ApiCallService apiCallService = new ApiCallService();

    public ProgressParser(String name, String url) {
        super(name, url);
    }


    public String callApi(int id, String url, String endpoint) throws IOException {
        String data = apiCallService.callService(id, url, endpoint);
        logger.info(data);
        return data;
    }

    @Override
    public String callApi() {
        return null;
    }

    @Override
    public Student parseStudent(int id) {
        try {
           String jsonString = callApi(id, URL_PROGRESS, STUDENT_BY_ID_ENDPOINT);
           if (jsonString.contains("{")) {
               JSONObject jsonObject = new JSONObject(jsonString);
               String fullName = jsonObject.getString("name");
               String firstName = splitFirstName(fullName);
               logger.info(firstName);
               logger.info(jsonObject.getJSONArray("inschrijvingen").toString());
               Student student = new Student();
               student.setFirstName(firstName);
           }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
        //Make student so app doesnt crash
        Student student = new Student();
        return student;
    }

    @Override
    public Transcript parseTranscript() {
        return null;
    }

    @Override
    public ExchangePosition parseExchangePosition() {
        return null;
    }

    public String splitFirstName(String name) {
        int index = name.indexOf(' ');
        if (index > -1) { // Check if there is more than one word.
            return name.substring(0, index); // Extract first word.
        } else {
            return name; // Text is the first word itself.
        }
    }

}
